package com.example.yhuan.daggerdemo.di.components;

import com.example.yhuan.daggerdemo.MainActivity;

import dagger.Component;

/**
 * Created by yhuan on 2016/12/24.
 */
//@Component(modules = MainActivityModule.class,dependencies = IPersenterComponent.class)
//@Component(modules = MainActivityModule.class)
@Component(dependencies = IPresenterComponent.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);

}
