public final class RoadBike extends Bike implements RoadVehicle, DeviceWithGearedEngine {
    // inherit numberOfWheels;
    // inherit currentSpeed;

    // the free public default constructor calls Bike's default constructor




    // inherit getSpeed



    @Override
    public void drive(double speed) {
        System.out.println("Make sure to be in a car's blindspot");
        System.out.println("before accelerating...");
        super.drive(speed);
    }

    // inherit stop





    // inherit revEngine




    // inherit demonstrateGearChange



    // inherit pullWheelie







    // for RoadVehicles we must implement...
    public void loadLuggage() {
        putInSaddlebag();
    }

    // unique to RoadBikes
    public void putInSaddlebag() {
        System.out.println("Putting luggage in saddlebag");
    }

}