package com.hiquanta.dagger2demo.android_sample.di.components;



import com.hiquanta.dagger2demo.android_sample.di.modules.UserModule;
import com.hiquanta.dagger2demo.android_sample.ui.SecondActivity;

import dagger.Subcomponent;

/**
 * Created by weilu on 2016/1/27.
 */

@Subcomponent(modules = {
        UserModule.class
})
public interface UserComponent {
    void inject(SecondActivity mSecondActivity);
}
