package Observer_pattern;

//simulates weather station
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();    //create the publisher

        //create three display types
        CurrentConditionsDisplay dc = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay ds = new StatisticsDisplay(weatherData);
        ForecastDisplay df = new ForecastDisplay(weatherData);

        //change data (in real life, these data will come from some physical devices)
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
