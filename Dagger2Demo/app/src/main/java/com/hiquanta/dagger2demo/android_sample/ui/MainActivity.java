package com.hiquanta.dagger2demo.android_sample.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.hiquanta.dagger2demo.R;
import com.hiquanta.dagger2demo.android_sample.MyApplication;
import com.hiquanta.dagger2demo.android_sample.bean.Login;
import com.hiquanta.dagger2demo.android_sample.bean.Person;
import com.hiquanta.dagger2demo.android_sample.di.components.StorageComponent;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * http://blog.csdn.net/qq_17766199/article/details/50606011
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.button1)
    Button mButton1;

    @Bind(R.id.button2)
    Button mButton2;

    @Bind(R.id.button3)
    Button mButton3;

//    @Inject
//    SharedPreferences mPreferences;//全局的SharedPreferences

    @Inject
    Person mPerson;
    @Inject
    Login login;
    StorageComponent mStorageComponent;
    private final String KEY = "Dagger 2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mStorageComponent = ((MyApplication)this.getApplication()).getStorageComponent();
        mStorageComponent.inject(this);//注入MainActivity
        mStorageComponent.execute().storage();//执行储存操作

    }

    @OnClick({
            R.id.button1,
            R.id.button2,
            R.id.button3
    })
    void onButtonClicked(View v) {
        switch (v.getId()) {
            case R.id.button1:
                //Toast.makeText(this,mPreferences.getString(KEY,"---"),Toast.LENGTH_SHORT).show();
                Toast.makeText(this,mStorageComponent.execute().getStorage(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this,login.getName() + "----" + mPerson.getAge(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Intent intent = new Intent(this,SecondActivity.class);
                startActivity(intent);
                break;
        }
    }
}
