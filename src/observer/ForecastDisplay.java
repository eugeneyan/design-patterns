package observer;

public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.2f;
    private float lastPressure;
    private final WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    public void display(){
        String message = "Forecast: ";
        if (currentPressure > lastPressure) {
            message += "Improving weather on the way.";
        } else if (currentPressure == lastPressure) {
            message += "More of the same.";
        } else if (currentPressure < lastPressure) {
            message += "Cooler, rainy weather on the way.";
        }
        System.out.println(message);
    }
}
