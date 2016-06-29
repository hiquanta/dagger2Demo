package com.hiquanta.dagger2demo.android_sample.di.modules;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;


import com.hiquanta.dagger2demo.android_sample.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by weilu on 2016/1/26.
 */
@Module
public class StorageModule {

    private final MyApplication application;

    public StorageModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(){
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

}
