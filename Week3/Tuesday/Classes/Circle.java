class Circle {
    // In JAVA, member variables are called 'fields'.
    public double radius;

    // In JAVA, member functions are called 'methods'.
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /*
      Until we define a contructor of our own,
      JAVA provides a sensible default constructor.
      It's as though we typed...

      public Circle() {
          radius = 0.0;
      }

      However, once we define our own constructor,
      JAVA no longer provides a default constructor.
      Therefore, uncommenting the constructor below will create
      a compiler-time error for the test code in Classes.java.
    */

    // public Circle(double r) {
    //     radius = r;
    // }
}
