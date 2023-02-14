public abstract class MotorVehicle implements Vehicle, DeviceWithGearedEngine {
    public final int numberOfWheels;
    private double currentSpeed;

    protected MotorVehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        this.currentSpeed = 0;
    }

    public final double getSpeed() {
        return currentSpeed;
    }

    public void drive(double speed) {
        currentSpeed = speed;
    }




    public void stop() {
        currentSpeed = 0;
    }



    public abstract void revEngine();




    public abstract void demonstrateGearChange();





















}