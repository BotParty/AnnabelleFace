package com.lukeyes.annabelleface.api;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;

import java.io.Closeable;

/**
 * Created by brandon on 2/12/2017.
 */


public interface SpeechController extends Closeable {
    void setPitch(float pitch);
    void setSpeechRate(float speechRate);

    int speak(CharSequence text);
    int speak(CharSequence text, int queueMode);
    int speak(CharSequence text, int queueMode, Bundle params);
    int speak(CharSequence text, int queueMode, Bundle params, String utteranceId);
}
