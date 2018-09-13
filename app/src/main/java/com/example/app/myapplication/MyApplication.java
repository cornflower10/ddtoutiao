package com.example.app.myapplication;

import com.yanxuwen.lib_common.BaseApplication;


public class MyApplication extends BaseApplication {
//    public static synchronized MyApplication getInstance() {
//        return mApplication;
//    }
    @Override
    public void onCreate() {
        super.onCreate();
        isLog=BuildConfig.LOG_DEBUG;
    }
}
