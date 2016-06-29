package com.hiquanta.dagger2demo.android_sample.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.hiquanta.dagger2demo.R;
import com.hiquanta.dagger2demo.android_sample.MyApplication;
import com.hiquanta.dagger2demo.android_sample.bean.Login;
import com.hiquanta.dagger2demo.android_sample.di.components.UserComponent;
import com.hiquanta.dagger2demo.android_sample.di.qualifiers.User;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondActivity extends AppCompatActivity {

    UserComponent userComponent;

    @Inject
    @User
    Login xiaoming;

    @Inject
    Login xiaoguan;

    @Bind(R.id.button4)
    Button mButton4;

    @Bind(R.id.button5)
    Button mButton5;

    Context app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        userComponent = ((MyApplication)this.getApplication()).getUserComponent();
        userComponent.inject(this);

        app = ((MyApplication)this.getApplication()).getAppComponent().getAppContext();


    }
    @OnClick({
            R.id.button4,
            R.id.button5,
    })
    void onButtonClicked(View v) {
        switch (v.getId()) {
            case R.id.button4:
                Toast.makeText(this,xiaoming.getName() + "----" + xiaoming.getPassword(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this,xiaoguan.getName() + "----" + xiaoguan.getPassword(),Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
