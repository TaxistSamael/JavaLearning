package patterns.oreilly.observer.from_java_util.model;

public class WeatherModel {

    public WeatherModel() {

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
