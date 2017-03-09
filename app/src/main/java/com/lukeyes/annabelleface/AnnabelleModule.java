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
import com.lukeyes.annabelleface.command.EyeCommand;
import com.lukeyes.annabelleface.command.FaceCommand;
import com.lukeyes.annabelleface.command.PauseCommand;
import com.lukeyes.annabelleface.command.PitchCommand;
import com.lukeyes.annabelleface.command.RateCommand;
import com.lukeyes.annabelleface.command.SayCommand;
import com.lukeyes.annabelleface.command.ViewCommand;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AnnabelleModule {

    FullscreenActivity _context;

    public AnnabelleModule(FullscreenActivity context) {
        _context = context;
    }

    @Provides @Singleton
    FullscreenActivity provideFullScreenActivity() {
        return _context;
    }

    @Provides @Singleton
    Context provideContext() {
        return _context;
    }

    @Provides
    @Singleton
    public ViewController providesViewController() {
        return new ViewControllerImpl(_context);
    }

    @Provides
    @Singleton
    public SpeechController providesSpeechController(ViewController view) {
        return new SpeechControllerImpl(_context,view);
    }

    @Provides
    @Singleton
    public CommandReference providesCommandReference(CommandLookup lookup) {
        return lookup;
    }


    //TODO FIGURE OUT DAGGER  + FACTORIES
    @Provides
    @Singleton
    public CommandLookup providesCommandLookup(FaceCommand face,  PitchCommand pitch, SayCommand say, PauseCommand pause, RateCommand rate, ViewCommand view, EyeCommand eye) {
        return new CommandLookup(face,pause,pitch,say,rate,view,eye);
    }

    @Provides
    public EyeCommand providesEyeCommand(ViewController vc) {
        return new EyeCommand(vc);
    }
    @Provides
    public FaceCommand providesFaceCommand(ViewController vc) {
        return new FaceCommand(vc);
    }
    @Provides
    public ViewCommand providesViewCommand(ViewController vc) {
        return new ViewCommand(vc);
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
    @Provides
    public RateCommand providesRateCommand(SpeechController sc) {
        return new RateCommand(sc);
    }



}

