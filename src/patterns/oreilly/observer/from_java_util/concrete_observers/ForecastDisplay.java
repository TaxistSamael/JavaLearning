package patterns.oreilly.observer.from_java_util.concrete_observers;

import patterns.oreilly.observer.from_java_util.WeatherData;
import patterns.oreilly.observer.from_java_util.model.WeatherModel;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements DisplayElement, Observer {

    private Observable observable;
    private WeatherModel weatherModel;

    public void setObservable(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void deleteObserver() {
        observable.deleteObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            final WeatherData weatherData = (WeatherData) o;
            this.weatherModel = weatherData.weatherModel;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Here is some stuff in Forecast, for example temp: " + weatherModel.temp);
    }
}
