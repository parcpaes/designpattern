package observer.weather.displays;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
