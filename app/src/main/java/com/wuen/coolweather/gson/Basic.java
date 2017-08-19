package com.wuen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**city表示城市名， id表示城市对应的天气id
 * update中的loc表示天气跟新的时间
 * Created by wpc on 2017/8/18.
 */

public class Basic
{
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }
}
