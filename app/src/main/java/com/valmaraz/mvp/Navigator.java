package com.valmaraz.mvp;

import android.content.Intent;
import android.support.annotation.NonNull;

import com.valmaraz.mvp.model.entity.City;
import com.valmaraz.mvp.view.activity.BaseActivity;
import com.valmaraz.mvp.view.activity.WeatherDetailsActivity;


public class Navigator {

    public Navigator() {
    }

    public void navigateToWeatherDetails(@NonNull BaseActivity from, @NonNull City city) {
        Intent intentToLaunch = WeatherDetailsActivity.getCallingIntent(from, city);
        from.startActivity(intentToLaunch);
    }
}
