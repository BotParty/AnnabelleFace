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
import com.lukeyes.annabelleface.command.FaceCommand;
import com.lukeyes.annabelleface.command.PauseCommand;
import com.lukeyes.annabelleface.command.PitchCommand;
import com.lukeyes.annabelleface.command.SayCommand;

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
        return new SpeechControllerImpl(_context);
    }

    @Provides @Singleton
    ViewController provideFaceController() {
        return new ViewControllerImpl(_context);
    }

    @Provides
    @Singleton
    public CommandReference providesCommandReference(CommandLookup lookup) {
        return lookup;
    }


    //TODO FIGURE OUT DAGGER  + FACTORIES
    @Provides
    @Singleton
    public CommandLookup providesCommandLookup(FaceCommand face,  PitchCommand pitch, SayCommand say, PauseCommand pause) {
        return new CommandLookup(face,pause,pitch,say);
    }

    @Provides
    public FaceCommand providesFaceCommand(ViewController vc) {
        return new FaceCommand(vc);
    }
    @Provides
    public SayCommand providesSayCommand(SpeechController sc) {
        return new SayCommand(sc);
    }
    @Provides
    public PauseCommand providesPauseCommand() {
        return new PauseCommand();
    }
    @Provides
    public PitchCommand providesPitchCommand(SpeechController sc) {
        return new PitchCommand(sc);
    }



}

