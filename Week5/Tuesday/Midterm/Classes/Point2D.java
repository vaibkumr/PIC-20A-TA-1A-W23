class Point2D {
    // fields...

    public double x;
    public double y;


    // constructors...

    // This constructor is private:
    // it can only be used from within the Point2D class.
    private Point2D(double x, double y) {
        // Here, 'this' is used to distinguish between
        // the fields we're initializing - this.x and this.y
        // and the parameters of the constructor - x and y.
        this.x = x; this.y = y;
    }

    public Point2D() {
        // Here, 'this' is used
        // to call another constructor (the private one defined above)
        // from within the constructor we're currently defining.
        // Such a call to 'this' must be
        // the first statement in a constructor's body.
        this(0, 0);
    }

    // This constructor creates a Point2D from a Point2D.
    // Such a constructor is called a 'copy constructor'.
    public Point2D(Point2D p) {
        // Again, 'this' is used to call
        // the private constructor above.
        // It copies the values of
        // the primitive fields x and y.
        this(p.x, p.y);
    }


    // factory methods...

    // Factory methods are similar to constructors,
    // but because they're static methods,
    // we can give them more useful names.
    // In this case, we provide two ways of
    // constructing a Point2D from a pair of doubles.

    // Using Cartesian coordinates...
    public static Point2D fromXY(double x, double y) {
        return new Point2D(x, y);
    }

    // Using Polar coordinates...
    public static Point2D fromPolar(double r, double theta) {
        double x = r * Math.cos(theta);
        double y = r * Math.sin(theta);

        return new Point2D(x, y);
    }

    // Even though we defined a copy constructor,
    // providing a factory method called copy doesn't hurt.
    public static Point2D copy(Point2D p) {
        return new Point2D(p);
    }


    // other methods...

    // When System.out.println(obj) or System.out.print(obj)
    // is called with a reference to an object as its argument,
    // it is as though System.out.println(obj.toString()) or
    // System.out.print(obj.toString()) is called, respectively.
    // Therefore, by defining toString, we can specify
    // how to print instances of our class.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // 'equals' is a commonly defined method and
    // allows us to compare two objects' values,
    // as opposed to == which simply asks whether
    // two references refer to the same object.
    public boolean equals(Point2D p) {
        return x == p.x && y == p.y;
    }

    // Here, we use Pythagoras to calculate
    // the distance between two Point2Ds.
    public double lengthTo(Point2D other) {
        double xDiff = x - other.x;
        double yDiff = y - other.y;
        // x and y are the fields of the implicit parameter.
        // We could also write this.x and this.y, respectively.
        // other.x and other.y are the fields of the explicit
        // parameter 'other'.

        double lengthSqu  =  xDiff * xDiff  +  yDiff * yDiff;
        return Math.sqrt(lengthSqu);
    }
}