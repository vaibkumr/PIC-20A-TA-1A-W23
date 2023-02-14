public class MotorVehicle {
    public final int numberOfWheels;
    private double currentSpeed;

    public MotorVehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        this.currentSpeed = 0;
    }

    public double getSpeed() {
        return currentSpeed;
    }
    public void drive(double speed) {
        currentSpeed = speed;
    }
    public void stop() {
        currentSpeed = 0;
    }
}
