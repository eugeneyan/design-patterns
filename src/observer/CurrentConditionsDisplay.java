package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    // Though we don't use weatherData, useful to have a reference for when we need to remove ourselves as observer.
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void display() {
        String message = String.format("Current conditions: %sF degrees and %s %% humidity", temperature, humidity);
        System.out.println(message);
    }
}
