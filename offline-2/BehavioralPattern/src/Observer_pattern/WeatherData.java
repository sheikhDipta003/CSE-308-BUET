package Observer_pattern;

import java.util.ArrayList;

public class WeatherData implements Publisher{
    private ArrayList<Observer> observers;
    private float temperature;      //WeatherData object is in sole control of all these data
    private float humidity;
    private float pressure;

    WeatherData(){observers = new ArrayList<>();}

    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob: observers) ob.update(temperature, humidity, pressure);
    }

    //This method is called from the physical device whenever changes are detected in the readings.
    //How it is called is not our concern.
    //The only thing we need to do is to notify all observers about these changes.
    public void measurementsChanged(){
        notifyObservers();
    }

    //Since we will not be taking data from any physical device in this case, we are simulating these changes through this function.
    public void setMeasurements(float temp, float hum, float pressure){
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = pressure;
        measurementsChanged();
    }
}
