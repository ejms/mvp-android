package com.valmaraz.mvp.view;

import com.valmaraz.mvp.model.entity.City;
import com.valmaraz.mvp.model.entity.Weather;

import java.util.List;


public interface WeatherListView extends LoadingView {
    void renderWeatherList(List<City> weatherCities);
}
