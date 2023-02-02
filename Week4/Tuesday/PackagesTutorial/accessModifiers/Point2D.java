package accessModifiers;

/*
  You've seen this class before.

  When comparing this file with
  the other Point2D.java that I shared,
  you will find the following differences.

   - The first line reads "package accessModifiers;".
   - The educational comments have been deleted.
   - The class has been marked as "public" on line 15.
*/

public class Point2D {
    public double x;
    public double y;

    private Point2D(double x, double y) {
        this.x = x; this.y = y;
    }
    public Point2D() {
        this(0, 0);
    }
    public Point2D(Point2D p) {
        this(p.x, p.y);
    }

    public static Point2D fromXY(double x, double y) {
        return new Point2D(x, y);
    }
    public static Point2D fromPolar(double r, double theta) {
        double x = r * Math.cos(theta);
        double y = r * Math.sin(theta);

        return new Point2D(x, y);
    }
    public static Point2D copy(Point2D p) {
        return new Point2D(p);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public boolean equals(Point2D p) {
        return x == p.x && y == p.y;
    }
    public double lengthTo(Point2D other) {
        double xDiff = x - other.x;
        double yDiff = y - other.y;

        double lengthSqu  =  xDiff * xDiff  +  yDiff * yDiff;
        return Math.sqrt(lengthSqu);
    }
}
