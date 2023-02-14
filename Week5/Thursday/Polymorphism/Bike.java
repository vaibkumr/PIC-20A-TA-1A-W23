public class Bike extends MotorVehicle {
    // inherit numberOfWheels;
    // inherit currentSpeed;

    public Bike() {
        super(2); // bikes have 2 wheels
    }

    // inherit getSpeed

    @Override
    public void drive(double speed) {
        System.out.println("Make sure to be in a car's blindspot");
        System.out.println("before accelerating...");
        super.drive(speed);
    }

    // inherit stop

    // unique to bikes
    public void pullWheelie() {
        System.out.println("Accelerate some more");
        System.out.println("Pull up front wheel");
        System.out.println("Pray that you live");
        System.out.println("Enjoy that sweet air");
    }
}
