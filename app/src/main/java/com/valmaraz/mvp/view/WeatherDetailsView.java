package com.valmaraz.mvp.view;

import com.valmaraz.mvp.model.entity.City;


public interface WeatherDetailsView extends LoadingView {
    void renderInitialData(City city);
    void renderCityDetail(City city);
}
