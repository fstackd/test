package com.wuen.coolweather.gson;

/**
 * Created by wpc on 2017/8/18.
 */

public class AQI
{
    public AQICity city;

    public class AQICity
    {
        public String aqi;
        public String pm25;
    }
}
