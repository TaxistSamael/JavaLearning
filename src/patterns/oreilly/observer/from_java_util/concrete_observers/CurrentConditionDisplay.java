package patterns.oreilly.observer.from_java_util.concrete_observers;

import patterns.oreilly.observer.from_java_util.WeatherData;
import patterns.oreilly.observer.from_java_util.model.WeatherModel;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Observable observable;
    private WeatherModel weatherModel;

    public void setObservabl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void deleteObservale() {
        observable.deleteObserver(this);
        observable = null;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.weatherModel = weatherData.weatherModel;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Weather model. temp: " + weatherModel.temp + " and humidity: " + weatherModel.humidity);
    }
}
