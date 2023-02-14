class Shapes {
    public static void main(String[] args) {
        ShapeWithAreaAndPerimeter square = new UnpositionedSquare(8);
        UnpositionedRectangle r = (UnpositionedSquare) square;
    }
}

interface ShapeWithAreaAndPerimeter {
    public double area();
    public double perimeter();
}

class UnpositionedCircle implements ShapeWithAreaAndPerimeter {
    // field
    public double radius;

    // constructor
    public UnpositionedCircle(double r) {
        radius = r;
    }

    // methods
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class UnpositionedRectangle implements ShapeWithAreaAndPerimeter {
    // fields
    public double sideLength1;
    public double sideLength2;

    // constructors
    public UnpositionedRectangle(double sl1, double sl2) {
        sideLength1 = sl1;
        sideLength2 = sl2;
    }
    public UnpositionedRectangle(double sl) {
        sideLength1 = sl;
        sideLength2 = sl;
    }

    // methods
    public double area() {
        return sideLength1 * sideLength2;
    }
    public double perimeter() {
        return 2 * (sideLength1 + sideLength2);
    }
}

class UnpositionedSquare extends UnpositionedRectangle
                         implements ShapeWithAreaAndPerimeter {
    // constructor
    public UnpositionedSquare(double sl) {
        super(sl);
    }
    // fields and methods are inherited
}

class Point2D {
    // fields
    public double x;
    public double y;

    // constructor
    public Point2D(double x, double y) {
        this.x = x; this.y = y;
    }

    // method
    public double lengthTo(Point2D other) {
        double xDiff = x - other.x;
        double yDiff = y - other.y;

        double lengthSqu  =  xDiff * xDiff  +  yDiff * yDiff;

        return Math.sqrt(lengthSqu);
    }
}

class PositionedTriangle implements ShapeWithAreaAndPerimeter {
    // field
    public final Point2D[] vertices;

    // constructors
    public PositionedTriangle(double Ax, double Ay,
                              double Bx, double By,
                              double Cx, double Cy) {
        vertices = new Point2D[] { new Point2D(Ax, Ay),
                                   new Point2D(Bx, By),
                                   new Point2D(Cx, Cy) };
    }
    public PositionedTriangle(Point2D A, Point2D B, Point2D C) {
        vertices = new Point2D[] { new Point2D(A.x, A.y),
                                   new Point2D(B.x, B.y),
                                   new Point2D(C.x, C.y) };
    }

    // methods
    public double area() {
        double side1x = vertices[1].x - vertices[0].x;
        double side1y = vertices[1].y - vertices[0].y;
        double side2x = vertices[2].x - vertices[0].x;
        double side2y = vertices[2].y - vertices[0].y;

        return 0.5 * Math.abs(side1x * side2y  -  side1y * side2x);
    }
    public double perimeter() {
        return vertices[0].lengthTo(vertices[1]) + 
               vertices[1].lengthTo(vertices[2]) + 
               vertices[2].lengthTo(vertices[0]);
    }
}
