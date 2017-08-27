package patterns.oreilly.observer.self_implemented;

import patterns.oreilly.observer.self_implemented.concrete_observers.CurrentConditionalDisplay;
import patterns.oreilly.observer.self_implemented.concrete_observers.ForecastDisplay;
import patterns.oreilly.observer.self_implemented.model.WeatherModel;
import patterns.oreilly.observer.self_implemented.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();

        final CurrentConditionalDisplay currentDisplay = new CurrentConditionalDisplay();
        currentDisplay.setSubject(weatherData);
        currentDisplay.startObserving();

        final ForecastDisplay forecastDisplay = new ForecastDisplay();
        forecastDisplay.setSubject(weatherData);
        currentDisplay.startObserving();

        weatherData.setMeasurements(new WeatherModel(12,23,37));
        weatherData.setMeasurements(new WeatherModel(92,8,54));
        weatherData.setMeasurements(new WeatherModel(23,456,342));
    }
}
