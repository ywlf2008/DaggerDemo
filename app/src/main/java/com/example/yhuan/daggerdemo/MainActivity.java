package com.example.yhuan.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.yhuan.daggerdemo.di.components.DaggerIActivityComponent;
import com.example.yhuan.daggerdemo.di.components.DaggerIPresenterComponent;
import com.example.yhuan.daggerdemo.di.components.DaggerMainActivityComponent;
import com.example.yhuan.daggerdemo.di.components.IActivityComponent;
import com.example.yhuan.daggerdemo.di.components.IPresenterComponent;
import com.example.yhuan.daggerdemo.di.modules.IActivityModule;
import com.example.yhuan.daggerdemo.presenter.IPresenter;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements IActivity {

    @Bind(R.id.text)
    TextView textView;
    @Inject
    IPresenter iPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        MainActivityComponent mainActivityComponent =  DaggerMainActivityComponent.builder().
//                mainActivityModule(new MainActivityModule(this)).build();
//        mainActivityComponent.inject(this);
        IActivityComponent iActivityComponent =  DaggerIActivityComponent.builder().iActivityModule(new IActivityModule(this)).build();
        IPresenterComponent presenterComponent = DaggerIPresenterComponent.builder().iActivityComponent(iActivityComponent).build();
        DaggerMainActivityComponent.builder().iPresenterComponent(presenterComponent).build().inject(this);


    }

    @Override
    public void showText(String text) {
        textView.setText(text);
    }

    @OnClick(R.id.text)
    public void onClick() {
        iPresenter.show();
    }
}
