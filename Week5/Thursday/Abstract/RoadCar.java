public final class RoadCar extends Car {
    // inherit numberOfWheels;
    // inherit currentSpeed;

    // the free public default constructor calls Car's default constructor




    // inherit getSpeed



    @Override
    public void drive(double speed) {
        System.out.println("Look carefully before accelerating...");
        super.drive(speed);
    }


    @Override
    public void stop() {
        System.out.println("Look carefully before decelerating...");
        super.stop();
    }

    // inherit revEngine




    public void demonstrateGearChange() {
        System.out.println("Shift with stick");
    }

    // inherit handBrakeTurn







    // for RoadVehicles we must implement...
    public void loadLuggage() {
        putInTrunk();
    }

    // unique to RoadCars
    public void putInTrunk() {
        System.out.println("Putting luggage in trunk");
    }

}