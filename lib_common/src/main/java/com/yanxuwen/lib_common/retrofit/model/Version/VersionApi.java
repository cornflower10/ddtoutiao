package com.yanxuwen.lib_common.retrofit.model.Version;

import com.yanxuwen.retrofit.Annotation.Description;
import com.yanxuwen.retrofit.Annotation.value;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;


@Description("版本检测")
public interface VersionApi  {
    @value
    final String url="version/latest";
    @POST(url)
    public abstract Observable<String> postString(@Body RequestBody description);
    @POST(url)
    public abstract Call<String> postString2(@Body RequestBody description);
}
