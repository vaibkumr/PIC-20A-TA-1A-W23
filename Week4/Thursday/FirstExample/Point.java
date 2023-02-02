/*
  INHERITANCE

  Suppose we want to write two classes:

   - Point, a class for storing
     - a position on the x-axis
     (together with some methods)

   - PointMass, a class for storing
     - a position on the x-axis
     - and the point's mass
     (together with some methods)

  Of course, we could write
  two separate classes very easily.

  However, a PointMass is a Point.
  Such "is a" relationships lead
  to the concept of 'inheritance'.

  First, we write the Point class as expected.
*/


public class Point {
    private double x;

    public Point(double x) {
        this.x = x;
    }

    public void shift(double dx) {
        x += dx;
    }

    public String toString() {
        return "position " + x;
    }
}