package com.valmaraz.mvp.model.entity;

import com.google.gson.annotations.SerializedName;


public class Sys {

    @SerializedName("type")
    public int type;

    @SerializedName("id")
    public int id;

    @SerializedName("message")
    public double message;

    @SerializedName("country")
    public String country;

    @SerializedName("sunrise")
    public int sunrise;

    @SerializedName("sunset")
    public int sunset;
}
