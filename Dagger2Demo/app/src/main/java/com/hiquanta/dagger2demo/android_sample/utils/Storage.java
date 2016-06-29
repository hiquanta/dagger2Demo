package com.hiquanta.dagger2demo.android_sample.utils;

import android.content.SharedPreferences;


import com.hiquanta.dagger2demo.android_sample.interfaces.ScheduleImpl;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * Created by weilu on 2016/1/26.
 */
public class Storage {

    private SharedPreferences mPreferences;
    private Lazy<ScheduleImpl> mScheduleImpl;
    private final String KEY = "Dagger 2";

    @Inject
    public Storage(SharedPreferences mPreferences , Lazy<ScheduleImpl> mScheduleImpl) {
        this.mPreferences = mPreferences;
        this.mScheduleImpl = mScheduleImpl;
    }

    public void storage() {
        mScheduleImpl.get().start();
        mPreferences.edit().putString(KEY, "Dagger 2 -- Example").commit();
        mScheduleImpl.get().end();
    }
    public String getStorage() {
        return mPreferences.getString(KEY,"---");
    }
}
