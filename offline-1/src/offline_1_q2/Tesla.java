package offline_1_q2;

public class Tesla extends Car{

    @Override
    void setColor() {
        color = "White";
    }

    @Override
    void setManufacturingCountry() {
        manufacturingCountry = "US";
    }

    @Override
    void setEngine() {
        engine = "Electric";
    }

    @Override
    void setDriveTrain() {
        driveTrain = "All wheels";
    }
}