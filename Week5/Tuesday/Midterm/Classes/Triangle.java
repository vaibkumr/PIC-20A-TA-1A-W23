/*
  Side note...

  If I was to give the Circle and Rectangle classes longer names,
  I'd call them UnpositionedCircle and UnpositionedRectangle
  because they are not positioned on the Cartesian plane.

  If I was to give the Triangle class below a longer name,
  I'd call it PositionedTriangle because it *is* positioned
  on the Cartesian plane.

  It'd be easy to write PositionedCircle:
  just specify the center as a Point2D.

  It'd be more complicated to write PositionedRectangle:
  you'd have to do some vector calculations to ensure
  four Point2Ds do actually create a rectangle.

  To write UnpositionedTriangle, you'd probably end up
  specifying two side lengths and an angle.
*/


/*
  For learning purposes, the main benefit of the Triangle class
  is that it uses the previously defined Point2D class.
*/
class Triangle {
    // a single field...

    public Point2D[] vertices;
    // Marking vertices 'final' would be wise, but
    // the 'final' keyword is discussed in subsequent snippets.


    // constructors...

    // This constructor is self-explanatory.
    public Triangle(double Ax, double Ay,
                    double Bx, double By,
                    double Cx, double Cy) {
        vertices = new Point2D[] { Point2D.fromXY(Ax, Ay),
                                   Point2D.fromXY(Bx, By),
                                   Point2D.fromXY(Cx, Cy) };
    }

    /*
      For this constructor,
      we're careful to copy the Point2Ds.

       - Point2Ds do not use a lot of memory,
         so the copying is not too expensive.

       - On the other hand,
         we want to avoid a user becoming
         confused by the following code...

             Point2D p1 = Point2D.fromXY(0, 1);
             Point2D p2 = Point2D.fromXY(1, 2);
             Point2D p3 = Point2D.fromXY(0, 3);

             Triangle t = new Triangle(p1, p2, p3);
             t.vertices[0].y = 0;

             System.out.println(p1);

         Try running this code before and after
         changing the definition to use the commented code.
    */
    public Triangle(Point2D A, Point2D B, Point2D C) {
        // vertices = new Point2D[] { A, B, C };

        vertices = new Point2D[] { Point2D.copy(A),
                                   Point2D.copy(B),
                                   Point2D.copy(C) };
    }


    // methods...

    // This definition uses a sneaky math formula.
    // Don't worry if you don't know that formula.
    public double area() {
        double side1x = vertices[1].x - vertices[0].x;
        double side1y = vertices[1].y - vertices[0].y;
        double side2x = vertices[2].x - vertices[0].x;
        double side2y = vertices[2].y - vertices[0].y;

        return 0.5 * Math.abs(side1x * side2y  -  side1y * side2x);
    }

    // By using the Point2D class' lengthTo method,
    // we can give a very easy to read definition of perimeter.
    public double perimeter() {
        return vertices[0].lengthTo(vertices[1]) + 
               vertices[1].lengthTo(vertices[2]) + 
               vertices[2].lengthTo(vertices[0]);
    }

    // Added for completeness...
    public String toString() {
        return vertices[0] + " --> " +
               vertices[1] + " --> " +
               vertices[2] + " --> " + vertices[0];
    }
    public boolean equals(Triangle t) {
        int[][] perms = {{0,1,2}, {0,2,1},
                         {1,0,2}, {1,2,0},
                         {2,0,1}, {2,1,0}};

        for (int[] perm : perms) {
            if (vertices[0].equals(t.vertices[perm[0]]) &&
                vertices[1].equals(t.vertices[perm[1]]) &&
                vertices[2].equals(t.vertices[perm[2]]))   { return true; }
        }
        return false;
    }
}