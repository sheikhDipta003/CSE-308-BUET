package offline_1_q2;

public class BMW extends Car{

    @Override
    void setColor() {
        color = "Black";
    }

    @Override
    void setManufacturingCountry() {
        manufacturingCountry = "Germany";
    }

    @Override
    void setEngine() {
        engine = "Electric";
    }

    @Override
    void setDriveTrain() {
        driveTrain = "Rear-wheel";
    }
}