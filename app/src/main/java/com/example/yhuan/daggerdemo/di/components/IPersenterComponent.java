package com.example.yhuan.daggerdemo.di.components;

import com.example.yhuan.daggerdemo.IActivity;
import com.example.yhuan.daggerdemo.di.modules.IPresenterModule;
import com.example.yhuan.daggerdemo.presenter.IPersenter;

import dagger.Component;

/**
 * Created by yhuan on 2016/12/24.
 */
@Component(modules = IPresenterModule.class)
public interface IPersenterComponent {

    IPersenter getPersenter(IActivity activity);

}
