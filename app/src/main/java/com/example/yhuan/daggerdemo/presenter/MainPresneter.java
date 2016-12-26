package com.example.yhuan.daggerdemo.presenter;

import com.example.yhuan.daggerdemo.IActivity;
import com.example.yhuan.daggerdemo.data.DataManager;
import com.example.yhuan.daggerdemo.data.IData;

/**
 * Created by yhuan on 2016/12/24.
 */

public class MainPresneter implements IPresenter{

    IActivity iActivity;
    IData iData;

    public MainPresneter(IActivity iActivity) {
        this.iActivity = iActivity;
        this.iData = new DataManager();
    }

    @Override
    public void show() {
        if(iData.find("lily")){
            iActivity.showText("success");
        }else{
            iActivity.showText("fail");
        }

    }

}
