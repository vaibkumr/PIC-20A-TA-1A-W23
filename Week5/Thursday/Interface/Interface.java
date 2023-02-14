class Interface {
    public static void main(String[] args) {
        /*
          An interface is similar to an abstract class
          (but there are more restrictions).

          An interface is implemented instead of inherited.
          You inherit a class; you implement a interface.

          Interfaces mostly specify public abstract methods.
          You can view an interface as a contract.
          An interface specifies methods its
          implementation must provide.

          The pay off for the extra rules is:
           - you can only inherit one class;
           - you can implement multiple interfaces.

                    Roses are red
                    Violets are blue
                    Extend only one
                    but implement two
                                    - Head First Java

          Some rules:
           - Interfaces are abstract.
              - Without specifying, they are,
                but you can redundantly specify abstract.
              - Recall, this means we cannot instantiate them.

           - Methods must be public.
              - Without specifying, they are,
                but you can redundantly specify public.

           - There are 3 types of methods for interfaces:
             abstract, default, and static.

􏰀             - Without specifying, abstract will be used,
               but you can redundantly specify abstract.
             - Recall that abstract methods are not implemented.

             - We might discuss default methods for interfaces later.
􏰀             - Static methods for interfaces are rarely used.

           - All fields must be public, static, and final.
              - Without specifying, they are,
                but you can redundantly specify these modifiers.
              - In other words, interfaces can only have constants as fields.

           - Interfaces do not have instance fields.
           - Interfaces do not have constructors.
        */
        RoadCar subaru = new RoadCar();
        RaceCar redBull = new RaceCar();
        RoadBike harley = new RoadBike();
        RaceBike ducati = new RaceBike();

        Vehicle[]                vehicle = new Vehicle[]                { subaru, redBull, harley, ducati };
        RoadVehicle[]            road    = new RoadVehicle[]            { subaru,          harley         };
        RaceVehicle[]            race    = new RaceVehicle[]            {         redBull,         ducati };
        DeviceWithGearedEngine[] geared  = new DeviceWithGearedEngine[] { subaru, redBull, harley, ducati };

        for (RoadVehicle r : road) {
            r.loadLuggage();
            r.drive(50);
            System.out.println(r.getSpeed());
            r.stop();
            System.out.println(r.getSpeed());                  System.out.println();
        }

        for (RaceVehicle r : race) {
            r.meltFace();                                      System.out.println();
        }

        for (DeviceWithGearedEngine g : geared) {
            g.revEngine();                                     System.out.println();
            g.demonstrateGearChange();                         System.out.println("\n");
        }
    }
}