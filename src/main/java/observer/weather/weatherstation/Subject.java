package observer.weather.weatherstation;

import observer.weather.displays.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
