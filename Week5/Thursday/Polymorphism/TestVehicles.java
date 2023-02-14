class TestVehicles {
    public static void f(MotorVehicle m, double speed) {
        System.out.println(m.numberOfWheels);
        m.drive(speed);
        System.out.println(m.getSpeed());
        m.stop();
        System.out.println(m.getSpeed());
        System.out.println();
    }


    public static void main(String[] args) {
        /*
          POLYMORPHISM

          Polymorphism is a Greek word that means "many-shaped".
          There are a few distinct aspects of polymorphism we need to discuss.
        */

        Car ferrari = new Car();
        Bike harley = new Bike();

        MotorVehicle myRide;

        /*
          First...
           - Instances of a derived class may be referenced
             by reference variables whose type is that of a base class.

             - For example, the reference variable 'myRide' has type MotorVehicle.
               It can be made to reference the instance of Car referenced by 'ferrari'.
               It can be made to reference the instance of Bike referenced by 'harley'.
        */

        myRide = ferrari; // myRide refeferences a Car.
        myRide = harley;  // myRide refeferences a Bike.

        /*
          The two assignments above are regarded as widening conversions.
          Why does this make sense?
           - 'ferrari' can only reference instances of Cars.
           - 'harley' can only reference instances of Bikes.
           - 'myRide' can reference instances of Cars, Bikes, and MotorVehicles.
        */

        /*
          A consequence of this first observation is that
          we can use instances of a derived class
          in places such as arrays and method arguments
          where one might expect instances of the base class.
        */

        MotorVehicle[] myRides = {ferrari, harley}; // giving an array of MotorVehicles
                                                    // a Car and Bike

        f(ferrari, 200); // calling f with a Car even though it expects a MotorVehicle
        f(harley, 88);   // calling f with a Bike even though it expects a MotorVehicle

        /*
          The output of the code raises more questions!
          Most broadly, we can ask...
           - what does the compiler check for?
           - what occurs at runtime?

          When polymorphism occurs,
          the object type is no longer identical
          to the reference variable's type.

           - The compiler uses the reference variable's type
             when considering what method calls to allow.
              - myRide can only use methods belonging to the MotorVehicle class.
                It cannot use methods belonging only to the Car and Bike classes.

           - However, once the compiler has done its job,
             at runtime, the object type is used to calculate which method to use.
              - Looking at the examples below, the first call to 'drive' uses
                Car's 'drive' method, whereas the second call to 'drive' uses
                Bike's 'drive' method.
        */

        myRide = ferrari;
        // myRide.handBrakeTurn();          // compile-time error: MotorVehicle
                                            // does not have a 'handBrakeTurn' method

        myRide.drive(200);                  // uses Car's 'drive' method
        myRide.stop();                      // uses MotorVehicle's 'stop' method
        System.out.println();


        myRide = harley;
        // myRide.pullWheelie();            // compile-time error: MotorVehicle
                                            // does not have a 'pullWheelie' method

        myRide.drive(88);                   // uses Bike's 'drive' method
        myRide.stop();                      // uses MotorVehicle's 'stop' method
        System.out.println();


        /*
          So what if we want to use a method
          that only a derived class has?

          Can we make narrowing conversions
          to convert a reference to a MotorVehicle
          to a reference to a Car or Bike?

           - The compiler will allow
             (Car) myRide and (Bike) myRide
             to convert the reference of type MotorVehicle
             to a reference of type Car and Bike, respectively.
           - However, runtime errors can occur.
             For example, we cannot convert
             between Cars and Bikes.
        */


        ferrari.handBrakeTurn();            System.out.println();

        myRide = ferrari;
        // myRide.handBrakeTurn();          // compile-time error: MotorVehicle
                                            // does not have a 'handBrakeTurn' method

        ((Car) myRide).handBrakeTurn();     System.out.println();


        Car myCar;
        // myCar = myRide;                  // compile-time error: attempted
                                            // an implicit narrowing conversion
        myCar = (Car) myRide;


        harley.pullWheelie();               System.out.println();

        myRide = harley;
        // myRide.pullWheelie();            // compile-time error: MotorVehicle
                                            // does not have a 'pullWheelie' method

        ((Bike) myRide).pullWheelie();      System.out.println();


        Bike myBike;
        // myBike = myRide;                 // compile-time error: attempted
                                            // an implicit narrowing conversion
        myBike = (Bike) myRide;


        myRide = ferrari;
        // myBike = (Bike) myRide;          // run-time error:
                                            // cannot convert a Car to a Bike

        myRide = harley;
        // myCar  = (Car) myRide;           // run-time error:
                                            // cannot convert a Bike to a Car
    }
}
