package patterns.oreilly.observer.self_implemented.concrete_observers;

import patterns.oreilly.observer.self_implemented.subject.Subject;
import patterns.oreilly.observer.self_implemented.model.WeatherModel;

public class StatisticsDisplay implements Observer, DisplayElement {

    private Subject subject;
    private WeatherModel weatherModel;

    @Override
    public void display() {
        System.out.println(weatherModel.humidity + " " + weatherModel.pressure + " " + weatherModel.temp);
    }

    @Override
    public void update(WeatherModel weatherModel) {
        this.weatherModel = weatherModel;
        display();
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void startObserving() {
        if (subject == null) return;
        subject.registerObserver(this);
    }

    @Override
    public void stopObserving() {
        if (subject == null) return;
        subject.removeObserver(this);
    }
}
