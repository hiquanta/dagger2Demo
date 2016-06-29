package com.hiquanta.dagger2demo.android_sample.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by weilu on 2016/1/26.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginScope {

}
