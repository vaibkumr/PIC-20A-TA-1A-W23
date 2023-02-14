public class Rectangle {
    public final double sideLength1;
    public final double sideLength2;

    public Rectangle(double sl1, double sl2) {
        sideLength1 = sl1;
        sideLength2 = sl2;
    }

    public String toString() {
        return sideLength1 + ", " + sideLength2;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Rectangle) {
            Rectangle that = (Rectangle) other;
            return that.canEqual(this) && this.sideLength1 == that.sideLength1
                                       && this.sideLength2 == that.sideLength2;
        }
        return false;
    }


    public boolean canEqual(Object other) {
        return other instanceof Rectangle;
    }

    @Override
    public int hashCode() {
        return (41 * (41 + (int) sideLength1) + (int) sideLength2);
    }
}