package com.yanxuwen.lib_common.Proxy;

import retrofit2.http.POST;


public interface Subject {
  @POST("地址")
  public void request();
}
