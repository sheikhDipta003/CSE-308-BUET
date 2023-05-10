package offline_1_q2;

abstract class Car{
    protected String color;
    protected String manufacturingCountry;
    protected String engine;
    protected String driveTrain;

    abstract void setColor();
    abstract void setManufacturingCountry();
    abstract void setEngine();
    abstract void setDriveTrain();

    public void showCarDetails(){
        System.out.println("\nColor: " + color);
        System.out.println("Manufacturing country: " + manufacturingCountry);
        System.out.println("Engine: " + engine);
        System.out.println("Drivetrain System: " + driveTrain);
    }
}
