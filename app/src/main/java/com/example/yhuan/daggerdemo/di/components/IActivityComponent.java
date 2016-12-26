package com.example.yhuan.daggerdemo.di.components;

import com.example.yhuan.daggerdemo.IActivity;
import com.example.yhuan.daggerdemo.di.modules.IActivityModule;

import dagger.Component;

/**
 * Created by yhuan on 2016/12/26.
 */
@Component(modules = IActivityModule.class)
public interface IActivityComponent {

    IActivity getActivity();

}
