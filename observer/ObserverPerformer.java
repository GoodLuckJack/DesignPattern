package com.gtja.pattern.observer;

import com.gtja.pattern.Performer;

public class ObserverPerformer extends Performer{

    @Override
    public void perform() {
        WeatherData weatherData = new WeatherData();

        ConditionsDisplayOne displayOne = new ConditionsDisplayOne(weatherData);
        ConditionsDisplayTwo displayTwo = new ConditionsDisplayTwo(weatherData);
        ConditionsDisplayThree displayThree = new ConditionsDisplayThree(weatherData);

        weatherData.setMeasurements(10, 20, 30);
        weatherData.setMeasurements(15, 25, 35);
        weatherData.setMeasurements(20, 60, 90);
    }
}
