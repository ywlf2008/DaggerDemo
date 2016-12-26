package com.example.yhuan.daggerdemo.di.components;

import com.example.yhuan.daggerdemo.di.modules.IPresenterModule;
import com.example.yhuan.daggerdemo.presenter.IPresenter;

import dagger.Component;

/**
 * Created by yhuan on 2016/12/24.
 */
@Component(modules = IPresenterModule.class,dependencies = IActivityComponent.class)
public interface IPresenterComponent {

    IPresenter getPresenter();

}
