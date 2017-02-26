package com.lukeyes.annabelleface;

import android.app.Application;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

/**
 * Created by brandon on 2/25/2017.
 */

public class AnnabelleApp extends Application {
    private ObjectGraph graph;

    @Override public void onCreate() {
        super.onCreate();

        graph = ObjectGraph.create(getModules().toArray());
    }

    protected List<Object> getModules() {
        return Arrays.asList(
                new AndroidModule(this),
                new AnnabelleModule()
        );
    }

    public void inject(Object object) {
        graph.inject(object);
    }
}
