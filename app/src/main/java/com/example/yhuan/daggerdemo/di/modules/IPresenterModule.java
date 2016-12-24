package com.example.yhuan.daggerdemo.di.modules;

import com.example.yhuan.daggerdemo.IActivity;
import com.example.yhuan.daggerdemo.presenter.IPersenter;
import com.example.yhuan.daggerdemo.presenter.MainPresneter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yhuan on 2016/12/24.
 */
@Module
public class IPresenterModule {

    @Provides
    IPersenter providePersenter(IActivity activity){
        return new MainPresneter(activity);
    }

}
