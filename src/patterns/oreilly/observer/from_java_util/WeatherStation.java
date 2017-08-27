package patterns.oreilly.observer.from_java_util;


import patterns.oreilly.observer.from_java_util.concrete_observers.CurrentConditionDisplay;
import patterns.oreilly.observer.from_java_util.concrete_observers.ForecastDisplay;
import patterns.oreilly.observer.from_java_util.model.WeatherModel;

public class WeatherStation {
    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();

        final CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        currentDisplay.setObservabl(weatherData);

        final ForecastDisplay forecastDisplay = new ForecastDisplay();
        forecastDisplay.setObservable(weatherData);

        weatherData.setMeasurements(new WeatherModel(12,23,37));
        weatherData.setMeasurements(new WeatherModel(92,8,54));
        weatherData.setMeasurements(new WeatherModel(23,456,342));
    }
}
