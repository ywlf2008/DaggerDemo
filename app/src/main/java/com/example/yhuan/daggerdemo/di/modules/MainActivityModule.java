package com.example.yhuan.daggerdemo.di.modules;

import com.example.yhuan.daggerdemo.IActivity;
import com.example.yhuan.daggerdemo.data.DataManager;
import com.example.yhuan.daggerdemo.data.IData;
import com.example.yhuan.daggerdemo.data.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yhuan on 2016/12/24.
 */
@Module
public class MainActivityModule {

    IActivity mActivity;

    public MainActivityModule(IActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    IActivity activity() {
        return (IActivity) mActivity;
    }

    @Provides
    User provideUser() {
        return new User("lily", 24);
    }

//    @Provides
//    IPersenter providePresenter(IActivity activity) {
//        return new MainPresneter(activity);
//    }

//    @Provides
//    IPersenter providePresenter(IPersenter persenter) {
//        return persenter;
//    }

    @Provides
    IData provideData(){
        return new DataManager();
    }

}
