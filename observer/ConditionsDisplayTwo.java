package com.gtja.pattern.observer;

public class ConditionsDisplayTwo implements Observer{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ConditionsDisplayTwo(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.print("Temperature is " + temperature + ";" + "Humidity is " + humidity + ";\n");
    }
}
