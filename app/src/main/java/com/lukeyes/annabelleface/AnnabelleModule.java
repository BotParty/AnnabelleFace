package com.lukeyes.annabelleface;

/**
 * Created by brandon on 2/25/2017.
 */

import com.lukeyes.annabelleface.api.SpeechController;
import com.lukeyes.annabelleface.api.SpeechControllerImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = FullscreenActivity.class,
        complete = false
)
public class AnnabelleModule {
    @Provides @Singleton SpeechController provideSpeechController() {
        return (SpeechController) new SpeechControllerImpl();
    }

    @Provides @Singleton FaceController provideFaceController() {

    }
}