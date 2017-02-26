package com.lukeyes.annabelleface;

/**
 * Created by brandon on 2/25/2017.
 */

import android.content.Context;

import com.lukeyes.annabelleface.api.SpeechController;
import com.lukeyes.annabelleface.api.SpeechControllerImpl;
import com.lukeyes.annabelleface.api.ViewController;
import com.lukeyes.annabelleface.api.ViewControllerImpl;
import com.lukeyes.annabelleface.command.CommandLookup;
import com.lukeyes.annabelleface.command.CommandReference;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AnnabelleModule {

    FullscreenActivity _context;

    public AnnabelleModule(FullscreenActivity context) {
        _context = context;
    }
    @Provides @Singleton SpeechController provideSpeechController() {
        return (SpeechController) new SpeechControllerImpl(_context);
    }

    @Provides @Singleton
    ViewController provideFaceController() {
        return new ViewControllerImpl(_context);
    }

    @Provides
    @Singleton
    public CommandReference providesCommandReference() {
        return new CommandLookup();
    }

}

