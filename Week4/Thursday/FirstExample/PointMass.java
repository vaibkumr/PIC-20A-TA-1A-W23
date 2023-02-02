/*
  INHERITANCE (continued)

  Below, we have given the definition of PointMass.
  We say...
   - PointMass 'inherits' from Point or PointMass 'extends' Point.
   - We also say...
       Point     is a base    class, parent class, superclass;
       PointMass is a derived class, child  class, subclass,  extended class.

  Before explaining the interface of PointMass,
  you may want to see how this class behaves in TestPoints.java.
*/


public class PointMass extends Point {

    private double m;

    public PointMass(double x, double m) {
        super(x);
        this.m = m;
    }

    public void changeMass(double newMass) {
        m = newMass;
    }

    public String toString() {
        return super.toString() + ", mass " + m;
    }
}


/*
  Explaining PointMass...

    - "PointMass extends Point" indicates that PointMass inherits from Point.
      What does this mean?

      - Since Point has a field called x, PointMass inherits a field called x.

        However, because x was marked private, PointMass cannot use x directly.
        Writing this.x = 0 in any method or constructor
        will give a compile-time error: "x has private access in Point."

        TestPoints.java clearly indicates that PointMass's have x's though.

      - Since Point has a public method called 'shift',
        PointMass inherits a method called 'shift'.

        Since 'shift' is public, the inherited method is also public.

        TestPoints.java demonstrates instances of PointMass using 'shift'
        to change the inherited x field.

      - Since Point has a public method called 'toString',
        PointMass would have inherited a method called 'toString'.

        However, we have defined another public method called 'toString'.
        This is allowed and is called overriding.
        This is relevant for discussing polymorphism (soon).

      - Constructors are not inherited.
        PointMass does not acquire a constructor accepting a single double.


    - When we inherit we are allowed to add extra fields and methods.

      - PointMass is given a private field called m.
      - PointMass is given a public method called 'changeMass'.
      - Points do not have these members; only PointMasses do.


    - When writing the constructor for PointMass,
      we wish to initialize the field x.

      - We cannot access it directly because it was marked private in Point.

      - However, just like using 'this' to call a constructor from a constructor,
        we can use 'super' to call a Base class's constructor
        from a Derived class's constructor.

      - super(x) calls Point(x) to initialize the Point's private field x.

      - Note: the call to 'super' must be the first statement in the constructor.


    - If we wish to call Point's 'toString' method
      from within PointMass's 'toString' method,
      we can write super.toString().

      - This feels similar to this.toString(),
        but calling this.toString() without any control flow
        inside the definition of 'toString'
        would lead to infinite recursion.
*/