package offline_1_q2;

public class Toyota extends Car{

    @Override
    void setColor() {
        color = "Red";
    }

    @Override
    void setManufacturingCountry() {
        manufacturingCountry = "Japan";
    }

    @Override
    void setEngine() {
        engine = "Hydrogen Fuel Cell";
    }

    @Override
    void setDriveTrain() {
        driveTrain = "Rear-wheel";
    }
}
