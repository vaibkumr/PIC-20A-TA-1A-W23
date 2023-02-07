class Rectangle {
    // fields...
    public double sideLength1; 
    public double sideLength2;

    // overloaded constructors...
    // making a rectangle using two side lengths
    public Rectangle(double sl1, double sl2) {
        sideLength1 = sl1;
        sideLength2 = sl2;
    }
    // making a square
    // (a special type of rectangle)
    // using one side length
    public Rectangle(double sl) {
        sideLength1 = sl;
        sideLength2 = sl;
    }

    // methods...
    public double area() {
        return sideLength1 * sideLength2;
    }
    public double perimeter() {
        return 2 * (sideLength1 + sideLength2);
    }
}
