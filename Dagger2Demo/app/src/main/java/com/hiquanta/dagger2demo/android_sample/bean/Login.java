package com.hiquanta.dagger2demo.android_sample.bean;

import javax.inject.Inject;

/**
 * Created by weilu on 2016/1/27.
 *
 */
public class Login {
    private String name ="wangfei";
    private String password ="123123";
    @Inject
    public Login(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
