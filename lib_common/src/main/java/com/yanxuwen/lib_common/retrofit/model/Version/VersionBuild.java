package com.yanxuwen.lib_common.retrofit.model.Version;

import android.content.Context;

import com.yanxuwen.lib_common.retrofit.MyBaseRequest;


public class VersionBuild  extends MyBaseRequest {
    public VersionBuild(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }
    public int platform;
    public String channel;
    public String version;
}
