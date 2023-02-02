package testing;

class Accessing {
    public static void main(String[] args) {
        /*
          We can use the Point2D class by writing

                  accessModifiers.Point2D

          This is Point2D's "fully qualified name".
        */
        accessModifiers.Point2D p0 = accessModifiers.Point2D.fromXY(0, 0);
        accessModifiers.Point2D p1 = accessModifiers.Point2D.fromXY(3, 4);
        System.out.println(p0.lengthTo(p1));


        // Similarly for ArrayFunctions and ArrayFuncsOneFile...
        accessModifiers.ArrayFunctions.print(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
        accessModifiers.ArrayFuncsOneFile.print(new int[] {1, 2, 3, 4, 5, 6, 7, 8});


        // accessModifiers.SubArrays sa;

        /*
          Not allowed! The error message reads...

          "SubArrays is not public in accessModifiers;
          cannot be accessed from outside package"
        */


        // accessModifiers.SubArraysSummingToTotal sastt;

        /*
          Not allowed! The error message reads...

          "SubArraysSummingToTotal is not public in accessModifiers;
          cannot be accessed from outside package"
        */
    }
}
