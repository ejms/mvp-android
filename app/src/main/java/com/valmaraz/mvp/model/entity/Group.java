package com.valmaraz.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Group {

    @SerializedName("cnt")
    public int cnt;

    @SerializedName("list")
    public List<City> cities;
}
