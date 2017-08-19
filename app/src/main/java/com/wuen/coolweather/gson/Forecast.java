package com.wuen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**未来一天的天气
 * Created by wpc on 2017/8/18.
 */

public class Forecast
{
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature
    {
        public String max;
        public String min;
    }

    public class More
    {
        @SerializedName("txt_d")
        public String info;
    }
}
