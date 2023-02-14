public final class RaceBike extends Bike implements RaceVehicle, DeviceWithGearedEngine {
    // inherit numberOfWheels;
    // inherit currentSpeed;

    // the free public default constructor calls Bike's default constructor




    // inherit getSpeed



    // inherit drive






    // inherit stop





    // inherit revEngine




    // inherit demonstrateGearChange



    // inherit pullWheelie







    // for RaceVehicles we must implement...
    public void meltFace() {
        System.out.println("Roll accelerator back");
        System.out.println("until reach max speed");

        pullWheelie();

        System.out.println("Slam brakes");
        System.out.println("Skid to a hault");
    }
}