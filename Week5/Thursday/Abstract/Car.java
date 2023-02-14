public abstract class Car extends MotorVehicle {
    // inherit numberOfWheels;
    // inherit currentSpeed;

    public Car() {
        super(4); // cars have 4 wheels
    }


    // inherit getSpeed



    // inherit drive






    // inherit stop





    public void revEngine() {
        System.out.println("Put in neutral");
        System.out.println("Right foot up and down");
    }

    // leave demonstrateGearChange without implementation



    // unique to cars
    public void handBrakeTurn() {
        System.out.println("Turn abruptly");
        System.out.println("Engage handbrake");
        System.out.println("Burn rubber");
    }












}