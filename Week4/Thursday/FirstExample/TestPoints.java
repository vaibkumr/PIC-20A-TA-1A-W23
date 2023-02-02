/*
  INHERITANCE (continued)

  The following code demonstrates using our new class PointMass.
*/


import static java.lang.System.out;


class TestPoints {
    public static void main(String[] arg) {
        Point p = new Point(0);             // Making an instance of Point.
        out.println(p.toString());          // Using Point's 'toString' method.
        p.shift(1);                         // Using Point's 'shift' method.
        out.println(p.toString());          // Using Point's 'toString' method.


        PointMass pm = new PointMass(2, 3); // Making an instance of PointMass.
        out.println(pm.toString());         // Using PointMass's 'toString' method.
        pm.shift(4);                        // PointMass inherits Point's 'shift' method.
        pm.changeMass(7);                   // PointMass has 'changeMass'
                                            // in addition to its inherited methods.
        out.println(pm.toString());         // Using PointMass's 'toString' method.
                                            // PointMass's 'toString' method
                                            // overrides Point's 'toString' method.


        // p.changeMass(8);                 // compile-time error:
                                            // Points do not have a 'changeMass' method.

        // pm = new PointMass(9);           // compile-time error:
                                            // constructors are not inherited.

        p = pm;
        System.out.println(p.toString());
        /*
          The previous code shows that a reference variable of type Point
          is allowed to reference a PointMass object.

          This is not unreasonable; after all, a PointMass *is a* Point!


          The previous code shows more though...

          Even though p is a reference variable of type Point,
          p.toString() uses PointMass's 'toString' method.


          The previous two observations are examples of POLYMORPHISM.

          In C++, one can control whether polymorphism occurs or not
          by using or not using the 'virtual' keyword.

          Java does not allow such a choice:
          polymorphism does and always will occur! 
        */
    }
}
