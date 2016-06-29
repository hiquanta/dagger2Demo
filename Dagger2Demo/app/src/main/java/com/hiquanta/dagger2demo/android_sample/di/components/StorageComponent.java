package com.hiquanta.dagger2demo.android_sample.di.components;



import com.hiquanta.dagger2demo.android_sample.di.modules.ScheduleModule;
import com.hiquanta.dagger2demo.android_sample.di.modules.StorageModule;
import com.hiquanta.dagger2demo.android_sample.ui.MainActivity;
import com.hiquanta.dagger2demo.android_sample.utils.Storage;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by weilu on 2016/1/26.
 */
@Singleton
@Component(modules = {
        StorageModule.class ,
        ScheduleModule.class
})
public interface StorageComponent {

    Storage execute();
    void inject(MainActivity mMainActivity);
}
