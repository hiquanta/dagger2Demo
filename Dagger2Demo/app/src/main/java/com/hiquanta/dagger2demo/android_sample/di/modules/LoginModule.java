package com.hiquanta.dagger2demo.android_sample.di.modules;


import com.hiquanta.dagger2demo.android_sample.bean.Login;
import com.hiquanta.dagger2demo.android_sample.bean.Person;
import com.hiquanta.dagger2demo.android_sample.di.scopes.LoginScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by weilu on 16/1/27.
 */
@Module
public class LoginModule {

    @Provides
    @LoginScope
    Person providePerson() {
        Person mPerson = new Person();
        mPerson.setAge(23);
        mPerson.setName("WeiLu");
        return mPerson;
    }
    @Provides
    Login provideLogin() {
        Login mLogin = new Login();
        mLogin.setPassword("######");
        mLogin.setName("小关");
        return mLogin;
    }
}
