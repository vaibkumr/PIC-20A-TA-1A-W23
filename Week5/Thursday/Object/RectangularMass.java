public class RectangularMass extends Rectangle {
    public final double mass;


    public RectangularMass(double sl1, double sl2, double m) {
        super(sl1, sl2);
        mass = m;
    }

    public String toString() {
        return super.toString() + "; " + mass;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof RectangularMass) {
            RectangularMass that = (RectangularMass) other;
            return that.canEqual(this) && this.mass == that.mass
                                       && super.equals(that);
        }
        return false;
    }

    @Override
    public boolean canEqual(Object other) {
        return other instanceof RectangularMass;
    }

    @Override
    public int hashCode() {
        return 41 * super.hashCode() + (int) mass;
    }
}