package com.valmaraz.mvp.model.network;


public interface NetworkCallback {
    void success(String body);
    void failure(String body);
}
