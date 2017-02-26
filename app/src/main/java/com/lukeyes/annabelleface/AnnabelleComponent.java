package com.lukeyes.annabelleface;

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
}
