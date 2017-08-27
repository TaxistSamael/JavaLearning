package patterns.oreilly.observer.self_implemented.subject;

import patterns.oreilly.observer.self_implemented.concrete_observers.Observer;
import patterns.oreilly.observer.self_implemented.model.WeatherModel;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList = new ArrayList<>();
    private WeatherModel weatherModel;

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(WeatherModel weatherModel) {
        this.weatherModel = weatherModel;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(weatherModel));
    }
}
