package Observer_pattern;

public class CurrentConditionsDisplay implements Observer, DisplayType{
    private float temperature;
    private float humidity;
    private float pressure;
    private Publisher weatherData;

    CurrentConditionsDisplay(Publisher weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: <Temperature: " + temperature + "F> <Humidity: " + humidity +
                            "%> <Pressure: " + pressure + "bar>");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();      //it's not necessary to call display here, for simplicity
    }
}
