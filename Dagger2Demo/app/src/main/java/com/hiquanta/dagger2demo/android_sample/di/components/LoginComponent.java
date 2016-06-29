package com.hiquanta.dagger2demo.android_sample.di.components;



import com.hiquanta.dagger2demo.android_sample.MyApplication;
import com.hiquanta.dagger2demo.android_sample.di.modules.LoginModule;
import com.hiquanta.dagger2demo.android_sample.di.scopes.LoginScope;

import dagger.Component;

/**
 * Created by weilu on 16/1/27.
 */

@LoginScope
@Component(modules = {
        LoginModule.class
})
public interface LoginComponent {
    void inject(MyApplication myApplication);
}
