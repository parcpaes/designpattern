package observer.weather.weatherstation;

import observer.weather.displays.Observer;
import observer.weather.weatherstation.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;

    List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity=humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }
    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        notifyObservers();
    }
}
