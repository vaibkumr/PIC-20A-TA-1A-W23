public abstract class Bike extends MotorVehicle {
    // inherit numberOfWheels;
    // inherit currentSpeed;

    protected Bike() {
        super(2); // bikes have 2 wheels
    }
    // inherit getSpeed
    // inherit drive
    // inherit stop
    public void revEngine() {
        System.out.println("Put in neutral");
        System.out.println("Roll on throttle with right hand");
    }

    public void demonstrateGearChange() {
        System.out.println("Clutch and left foot stuff");
    }

    // unique to bikes
    public void pullWheelie() {
        System.out.println("Accelerate some more");
        System.out.println("Pull up front wheel");
        System.out.println("Pray that you live");
        System.out.println("Enjoy that sweet air");
    }
}