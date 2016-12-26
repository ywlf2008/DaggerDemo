package com.example.yhuan.daggerdemo.di.modules;

import com.example.yhuan.daggerdemo.IActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yhuan on 2016/12/26.
 */
@Module
public class IActivityModule {

    IActivity activity;

    public IActivityModule(IActivity activity) {
        this.activity = activity;
    }

    @Provides
    IActivity activity(){
        return activity;
    }

}
