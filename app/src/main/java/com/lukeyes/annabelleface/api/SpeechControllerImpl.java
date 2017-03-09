package com.lukeyes.annabelleface.api;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.View;

import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by brandon on 2/12/2017.
 */

@Singleton
public class SpeechControllerImpl implements SpeechController {


    private TextToSpeech textToSpeech;
    private final UtteranceProgressListener _listener;

    @Inject
    public SpeechControllerImpl(Context context, ViewController view ) {
        _listener = getListener(view);
        textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    // Set preferred language to US english.
                    // Note that a language may not be available, and the result will indicate this.
                    int result = textToSpeech.setLanguage(Locale.US);
                    // Try this someday for some interesting results.
                    // int result mTts.setLanguage(Locale.FRANCE);
                    if (result == TextToSpeech.LANG_MISSING_DATA ||
                            result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        // Lanuage data is missing or the language is not supported.
                        Log.d("TTS","Language is not available.");
                    } else {
                        // Check the documentation for other possible result codes.
                        // For example, the language may be available for the locale,
                        // but not for the specified country and variant.

                        // The TTS engine has been successfully initialized.

                    }
                } else {
                    // Initialization failed.
                    Log.e("TTS", "Could not initialize TextToSpeech.");
                }

                textToSpeech.setOnUtteranceProgressListener(_listener);

            }
        }

        );


    }

    private UtteranceProgressListener getListener(final ViewController view) {
        return new UtteranceProgressListener() {
            @Override
            public void onStart(String utteranceId) {
                view.talk(true);
            }

            @Override
            public void onBeginSynthesis(String utteranceId,
                                         int sampleRateInHz,
                                         int audioFormat,
                                         int channelCount) {
                view.talk(true);
            }

            @Override
            public void onDone(String utteranceId) {
                view.talk(false);
                synchronized (this) {
                    this.notify();
                }

            }

            @Override
            public void onError(String utteranceId) {
                view.talk(false);
            }
        };
    }

    @Override
    public void setPitch(float pitch) {
        textToSpeech.setPitch(pitch);
    }

    @Override
    public void setSpeechRate(float speechRate) {
        textToSpeech.setSpeechRate(speechRate);
    }

    @Override
    public int speak(CharSequence text) {
        return speak(text, TextToSpeech.QUEUE_FLUSH);
    }

    @Override
    public int speak(CharSequence text, int queueMode) {

        return speak(text,queueMode,null);
    }

    @Override
    public int speak(CharSequence text, int queueMode, Bundle params) {
        return speak(text,queueMode,params, UUID.randomUUID().toString());
    }

    @Override
    public int speak(CharSequence text, int queueMode, Bundle params, String utteranceId) {


        int result = textToSpeech.speak(text,queueMode,params,utteranceId);

        synchronized (_listener) {
            try {
                _listener.wait(3000);
            } catch (InterruptedException ex) {}
        }
        return result;
    }

    @Override
    public void close() {
        // Don't forget to shutdown!
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }
}
