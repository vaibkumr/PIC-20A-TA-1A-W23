class MathVector {
    private final int      dim;
    private final double[] values;


    public MathVector(int N) {
        dim    = 0;
        values = null;
    }
    public MathVector(double... arr) {
        dim    = 0;
        values = null;
    }
    public MathVector(MathVector v) {
        dim    = 0;
        values = null;
    }


    public static MathVector vec2DfromPolar(double r, double theta) {
        return new MathVector(0);
    }

    public static MathVector vec3DfromPolar(double r, double theta, double phi) {
        return new MathVector(0);
    }


    public int getDimension() { return 0; }


    public double getValue(int idx) { return 0; }
    public void setValue(int idx, double val) {}


    public double dotWith(MathVector other) { return 0; }
    public double getMagnitude() { return 0; }


    public void scaleBy(double scalar) {}
    public static MathVector multiply(double scalar, MathVector v) {
        return new MathVector(0);
    }


    public void shiftBy(MathVector other) {}
    public static MathVector add(MathVector v1, MathVector v2) {
        return new MathVector(0);
    }
    public static MathVector add(MathVector... vs) {
        return new MathVector(0);
    }


    public boolean equals(MathVector other) { return false; }


    public String toString() { return ""; }
    public void print() {}
}