package com.hiquanta.dagger2demo.android_sample.di.modules;

import android.content.Context;


import com.hiquanta.dagger2demo.android_sample.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by weilu on 2016/1/27.
 */
@Module
public class AppModule {

    private final MyApplication application;

    public AppModule(MyApplication application) {
        this.application = application;
    }
    @Provides
    @Singleton
    public Context provideContext() {
        return application;
    }
}
