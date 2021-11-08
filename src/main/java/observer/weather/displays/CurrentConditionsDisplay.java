package observer.weather.displays;

import observer.weather.weatherstation.Subject;

public class CurrentConditionsDisplay implements Observer,Display {
    private float temperature;
    private float humidity;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        show();
    }
    @Override
    public void show() {
        System.out.println("Current Condition "+temperature+" F degrees and "+humidity+" %humidity");
    }


}
