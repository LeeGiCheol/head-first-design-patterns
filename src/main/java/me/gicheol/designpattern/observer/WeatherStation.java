package me.gicheol.designpattern.observer;

import me.gicheol.designpattern.observer.observer.CurrentConditionsDisplay;
import me.gicheol.designpattern.observer.observer.ForecastDisplay;
import me.gicheol.designpattern.observer.observer.StatisticsDisplay;
import me.gicheol.designpattern.observer.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
