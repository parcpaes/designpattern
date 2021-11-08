package observer.weather;

import observer.weather.displays.CurrentConditionsDisplay;
import observer.weather.weatherstation.Subject;
import observer.weather.weatherstation.WeatherData;

public class MainWeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
