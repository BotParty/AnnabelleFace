package com.lukeyes.annabelleface;

import com.lukeyes.annabelleface.command.CommandLookup;
import com.lukeyes.annabelleface.command.CommandReference;
import com.lukeyes.annabelleface.command.FaceCommand;
import com.lukeyes.annabelleface.command.PauseCommand;
import com.lukeyes.annabelleface.command.PitchCommand;
import com.lukeyes.annabelleface.command.SayCommand;
import com.lukeyes.annabelleface.command.ViewCommand;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by brandon on 2/26/2017.
 */

@Singleton
@Component(modules={AppModule.class, AnnabelleModule.class})
public interface AnnabelleComponent {
  //  FullscreenActivity oontext();
    void inject(FullscreenActivity activity);
    void inject(CommandReference reference);
    void inject(CommandLookup lookup);
    void inject(FaceCommand face);
    void inject(ViewCommand face);
    void inject(PauseCommand pause);
    void inject(PitchCommand pitch);
    void inject(SayCommand say);
}


