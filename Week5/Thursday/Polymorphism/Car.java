public class Car extends MotorVehicle {
    // inherit numberOfWheels;
    // inherit currentSpeed;

    public Car() {
        super(4); // cars have 4 wheels
    }

    // inherit getSpeed

    @Override
    public void drive(double speed) {
        System.out.println("Look carefully before accelerating...");
        super.drive(speed);
    }

    // inherit stop

    // unique to cars
    public void handBrakeTurn() {
        System.out.println("Turn abruptly");
        System.out.println("Engage handbrake");
        System.out.println("Burn rubber");
    }
}
