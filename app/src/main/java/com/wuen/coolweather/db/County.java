package com.wuen.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 汪鹏程 on 2017/8/18.
 */

public class County extends DataSupport
{
    private int id;
    private String contyName;
    private String weatherId;
    private int cityId;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getContyName()
    {
        return contyName;
    }

    public void setContyName(String contyName)
    {
        this.contyName = contyName;
    }

    public String getWeatherId()
    {
        return weatherId;
    }

    public void setWeatherId(String weatherId)
    {
        this.weatherId = weatherId;
    }

    public int getCityId()
    {
        return cityId;
    }

    public void setCityId(int cityId)
    {
        this.cityId = cityId;
    }
}
