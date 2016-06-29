package com.hiquanta.dagger2demo.android_sample;

import android.app.Application;


import com.hiquanta.dagger2demo.android_sample.bean.Login;
import com.hiquanta.dagger2demo.android_sample.bean.Person;
import com.hiquanta.dagger2demo.android_sample.di.components.AppComponent;
//import com.hiquanta.dagger2demo.android_sample.di.components.DaggerAppComponent;
//import com.hiquanta.dagger2demo.android_sample.di.components.DaggerLoginComponent;
//import com.hiquanta.dagger2demo.android_sample.di.components.DaggerStorageComponent;
import com.hiquanta.dagger2demo.android_sample.di.components.DaggerAppComponent;
import com.hiquanta.dagger2demo.android_sample.di.components.DaggerLoginComponent;
import com.hiquanta.dagger2demo.android_sample.di.components.DaggerStorageComponent;
import com.hiquanta.dagger2demo.android_sample.di.components.LoginComponent;
import com.hiquanta.dagger2demo.android_sample.di.components.StorageComponent;
import com.hiquanta.dagger2demo.android_sample.di.components.UserComponent;
import com.hiquanta.dagger2demo.android_sample.di.modules.AppModule;
import com.hiquanta.dagger2demo.android_sample.di.modules.LoginModule;
import com.hiquanta.dagger2demo.android_sample.di.modules.StorageModule;
import com.hiquanta.dagger2demo.android_sample.di.modules.UserModule;

import javax.inject.Inject;

/**
 * Created by weilu on 2016/1/26.
 */
public class MyApplication extends Application {

    private StorageComponent component;
    private AppComponent mAppComponent;
    private UserComponent mUserComponent;
    private LoginComponent mLoginComponent;

    @Inject
    Person mPerson;

    @Inject
    Login mLogin;
    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerStorageComponent
                .builder()
                .storageModule(new StorageModule(this))
                .build();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        mUserComponent = mAppComponent.createUserComponent(new UserModule());

        mLoginComponent = DaggerLoginComponent.builder()
                .loginModule(new LoginModule())
                .build();
        mLoginComponent.inject(this);

    }

    public StorageComponent getStorageComponent() {
        return component;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public UserComponent getUserComponent() { return mUserComponent;}

    public LoginComponent getLoginComponent() { return mLoginComponent;}

}