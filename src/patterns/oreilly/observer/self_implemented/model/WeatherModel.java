package patterns.oreilly.observer.self_implemented.model;

public class WeatherModel {

    public WeatherModel () {

    }

    public WeatherModel(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float temp;
    public float humidity;
    public float pressure;
}
