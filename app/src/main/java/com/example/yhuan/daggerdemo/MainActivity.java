package com.example.yhuan.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.yhuan.daggerdemo.di.components.DaggerIPersenterComponent;
import com.example.yhuan.daggerdemo.di.components.DaggerMainActivityComponent;
import com.example.yhuan.daggerdemo.di.components.MainActivityComponent;
import com.example.yhuan.daggerdemo.di.modules.IPresenterModule;
import com.example.yhuan.daggerdemo.di.modules.MainActivityModule;
import com.example.yhuan.daggerdemo.presenter.IPersenter;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements IActivity {

    @Bind(R.id.text)
    TextView textView;
    @Inject
    IPersenter iPersenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        iPersenter = new MainPresneter(this);
//        DaggerMainActivityComponent.builder().mainActivityModule(new MainActivityModule(this)).build().inject(this);

        MainActivityComponent mainActivityComponent =  DaggerMainActivityComponent.builder().
                mainActivityModule(new MainActivityModule(this)).build();
        mainActivityComponent.inject(this);

        //asdasd

    }

    @Override
    public void showText(String text) {
        textView.setText(text);
    }

    @OnClick(R.id.text)
    public void onClick() {
        iPersenter.show();
    }
}
