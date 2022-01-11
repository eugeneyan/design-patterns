package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private int numReadings;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);

        String message = String.format("Registered: %s", o);
        System.out.println(message);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);

        String message = String.format("Removed: %s", o);
        System.out.println(message);
    }

    public void notifyObservers() {
        for (Observer o: observers) {
            o.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
        String message = String.format("New weather data available (reading: %s)", numReadings);
        System.out.println(message);
        System.out.println("======================================================");
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        numReadings++;
        measurementsChanged();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }
}
