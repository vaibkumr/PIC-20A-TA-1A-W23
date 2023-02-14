public final class RaceCar extends Car {
    // inherit numberOfWheels;
    // inherit currentSpeed;

    // the free public default constructor calls Car's default constructor




    // inherit getSpeed



    // inherit drive






    // inherit stop





    // inherit revEngine




    public void demonstrateGearChange() {
        System.out.println("Shift with paddles");
    }

    // inherit handBrakeTurn







    // for RaceVehicles we must implement...
    public void meltFace() {
        System.out.println("Accelerator to the floor");
        System.out.println("until reach max speed");

        handBrakeTurn();

        System.out.println("Slam brakes");
        System.out.println("Skid to a hault");
    }
}