package com.valmaraz.mvp.model.entity;

import com.google.gson.annotations.SerializedName;


public class Error {

    @SerializedName("cod")
    public int cod;

    @SerializedName("message")
    public String message;
}
