package patterns.oreilly.observer.from_java_util;

import patterns.oreilly.observer.from_java_util.model.WeatherModel;

import java.util.Observable;

public class WeatherData extends Observable {

    public WeatherModel weatherModel;

    /**
     * Object doesn't pass as argument, so we use REQUEST MODEL in this case.
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(WeatherModel weatherModel) {
        this.weatherModel = weatherModel;
        measurementsChanged();
    }
}
