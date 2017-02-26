package com.lukeyes.annabelleface;

import android.app.Application;

import com.lukeyes.annabelleface.command.CommandLookup;
import com.lukeyes.annabelleface.command.CommandReference;

import java.util.Arrays;
import java.util.List;

import javax.inject.Singleton;

import dagger.Provides;


/**
 * Created by brandon on 2/25/2017.
 */

public class AnnabelleApp extends Application {
    //private ObjectGraph graph;
    private AnnabelleComponent mAnnabelleComponent;

    @Override public void onCreate() {
        super.onCreate();

    }


    public AnnabelleComponent getAnnabelleComponent() {
        return mAnnabelleComponent;
    }


}
