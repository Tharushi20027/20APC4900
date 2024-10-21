// Client code
public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();

        weatherStation.attach(temperatureDisplay);

        // Simulate a temperature change
        weatherStation.setTemperature(25);
    }
}

