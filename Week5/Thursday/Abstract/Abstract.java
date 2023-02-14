class Abstract {
    public static void main(String[] args) {
        /*
          ABSTRACT CLASSES, ABSTRACT METHODS,
          FINAL CLASSES, FINAL METHODS

          In the Polymorphism snippet
          we made use of classes called
          MotorVehicle, Car, and Bike.
          In that snippet
          we never created an instance of a MotorVehicle.
          We made a reference variable of type MotorVehicle (myRide),
          but it always referenced either a Car object or a Bike object.

          Sometimes one writes a class to serve
          as a superclass to other classes,
          i.e. to be inherited from,
          and one does not intend to instantiate the class.

          Furthermore, sometimes one writes such a class
          to impose restrictions on the subclasses that inherit from it,
          forcing the subclasses to implement desired methods.

          These objectives motivate the concepts of
          abstract classes and abstract methods.
        */


        /*
          ABSTRACT CLASSES

          An abstract class is indicated
          by writing the 'abstract' keyword
          before the 'class' keyword.

          MotorVehicle, Car, and Bike are abstract classes.
          This means that we cannot instantiate them.
        */

        // MotorVehicle motor = new MotorVehicle(3); // error: MotorVehicle is abstract
        // Car car = new Car();                      // error: Car is abstract
        // Bike bike = new Bike();                   // error: Bike is abstract


        /*
          CONCRETE CLASSES

          A non-abstract class is also called a concrete class.
          Concrete classes can be instantiated.

          RoadCar, RaceCar, RoadBike, RaceBike are concrete classes.
          We instantiate them below.
        */

        RoadCar subaru = new RoadCar();
        RaceCar redBull = new RaceCar();
        RoadBike harley = new RoadBike();
        RaceBike ducati = new RaceBike();


        /*
          ABSTRACT METHODS

          An abstract class can have abstract methods.
          These are indicated by using the 'abstract' keyword.
          Abstract methods can be declared without an implementation.
          See

              public abstract void revEngine();
              public abstract void demonstrateGearChange();

          in MotorVehicle.java.

          Concrete classes cannot have any abstract methods.
          As soon as a class has an abstract method,
          it must be an abstract class.

          Q: Why do we give an abstract classes abstract methods?
          A: Although an abstract class cannot be instantiated,
             an abstract class can be inherited from.
             Since concrete classes cannot have abstract methods,
             a concrete class inheriting from a class with abstract methods
             must implement those methods. Therefore, abstract methods
             give a way to impose useful constraints on an abstract class's
             subclasses, forcing them to implement methods of our choosing.

          In the example, we don't know
          how to implement revEngine and demonstrateGearChange
          for a generic MotorVehicle. More precisely,
           - until we have a Car or a Bike,
             we cannot implement revEngine;
           - until we have a RoadCar, RaceCar, or Bike,
             we cannot implement demonstrateGearChange.

          In summary...
           - we can't give a definition of
             revEngine and demonstrateGearChange
             for a generic MotorVehicle;
           - we want subclasses of MotorVehicle
             to implement revEngine and demonstrateGearChange.

          The solution is to make
          revEngine and demonstrateGearChange abstract.
          An abstract class like MotorVehicle lays out what its subclasses
          should do while only partially providing their implementation.
        */


        /*
          REFERENCES WITH AN ABSTRACT CLASS AS THEIR TYPE

          Although we cannot instantiate an abstract class,
          polymorphism allows us to use references
          with an abstract class as their type
          in a useful way.

          Below, we make arrays of MotorVehicles, Cars, and Bikes.
          Each of these classes is abstract and the arrays
          store references of the corresponding type.
          Due to polymorphism, the arrays are able to store
          more than null; for example, the array of MotorVehicles
          can store references to instances of the concrete classes
          RoadCar, RaceCar, RoadBike, RaceBike.

          The enhanced 'for' loops show that we can call methods
          using references whose type is that of an abstract class.
        */

        MotorVehicle[] motor = new MotorVehicle[] { subaru, redBull, harley, ducati };
        Car[]          car   = new Car[]          { subaru, redBull                 };
        Bike[]         bike  = new Bike[]         {                  harley, ducati };

        for (MotorVehicle m : motor) {
            System.out.println(m.numberOfWheels + " wheels");  System.out.println();
            m.revEngine();                                     System.out.println();
            m.demonstrateGearChange();                         System.out.println("\n");
        }

        for (Car c : car) {
            c.handBrakeTurn();                                 System.out.println();
        }

        for (Bike b : bike) {
            b.pullWheelie();                                   System.out.println();
        }


        /*
          CONSTRAINTS WHEN USING ABSTRACT CLASSES AND ABSTRACT METHODS

          We've seen that concrete classes
          must implement any abstract methods in their superclasses.

           - MotorVehicle has revEngine and demonstrateGearChange as abstract methods.

           - The concrete classes RoadCar, RaceCar, RoadBike, RaceBike
             give implementations of these methods.

             - RoadCar
               - Car implements revEngine and RoadCar inherits this method.
               - RoadCar implements demonstrateGearChange.
             - RaceCar
               - Car implements revEngine and RaceCar inherits this method.
               - RaceCar implements demonstrateGearChange.
             - RoadBike and RaceBike
               - Bike implements revEngine and demonstrateGearChange.
                 RoadBike and RaceBike inherit these methods.

           - Since Car does not implement demonstrateGearChange,
             Car has to be abstract.
           - Since Bike has implemented revEngine and demonstrateGearChange,
             we could choose to make Bike a concrete class by removing the
             'abstract' keyword.


          FREEDOM CONCERNING ABSTRACT CLASSES AND ABSTRACT METHODS

          An abstract class may or may not include abstract methods.
           - MotorVehicle has abstract methods: revEngine, demonstrateGearChange.
           - Car has an abstract method: demonstrateGearChange.
           - Bike does not have any abstract methods:
             it implemented both revEngine and demonstrateGearChange.
        */


        /*
          FINAL CLASSES

          A final class is indicated
          by writing the 'final' keyword
          before the 'class' keyword.

          RoadCar, RaceCar, RoadBike, and RaceBike are final classes.
          This means that we cannot inherit from them.

          Of course, this example is somewhat artificial.
          You could disagree with making RoadCar final.
          Perhaps you'd like classes called Subaru and BMW
          to inherit from RoadCar.

          In a way, final is the opposite of abstract.
          an abstract class is designed to be inherited from;
          a final class cannot be inherited from.

          Professional programmers should design and document
          for inheritance or else prohibit it with final.


          FINAL METHODS

          A final method is also indicated by using the 'final' keyword.
          See

              public final double getSpeed()

          in MotorVehicle.java.

          A final method cannot be overridden (or hidden).
          Again, in a way, final is the opposite of abstract:
          an abstract method must be overridden in order to obtain a concrete class;
          a final method cannot be overridden.

          Methods called from constructors should generally be declared final.
          If a constructor calls a non-final method,
          a subclass may override that method causing bad things to happen.
        */
    }
}