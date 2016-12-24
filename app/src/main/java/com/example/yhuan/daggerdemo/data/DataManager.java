package com.example.yhuan.daggerdemo.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yhuan on 2016/12/24.
 */

public class DataManager implements IData {

    Map<String, User> map;

    public DataManager() {
        map = new HashMap<>();
        User user = new User("lily", 24);
        map.put(user.getName(), user);
    }

    @Override
    public boolean find(String id) {
        for (String name : map.keySet()) {
            if(name.equals(id)){
                return true;
            }
        }
        return false;
    }
}
