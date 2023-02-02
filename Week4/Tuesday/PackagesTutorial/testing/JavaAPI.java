package testing;

/*
  The Java language comes with a library called
  the Java API (Application Program Interface).
  The Java API is organized into packages like
  java.lang and java.util.

  One way of using a class found within such a package
  is to refer to its fully qualified name.

  e.g. java.lang.System; java.lang.String; java.lang.Math, java.util.Arrays.
*/

// When using a class found within a package, it can be convenient to import it.
import java.util.Arrays;

// You can import an entire package using *...
import java.lang.*;
/*
  java.lang is special: import java.lang.*; was done automatically.
  This is why we could always use System, String, and Math.
*/

// We can import static fields and methods of a class with static imports...
import static java.lang.System.out;    // static field
import static java.lang.Math.sqrt;     // static method
import static java.lang.Math.PI;       // static field

// You can import all static members of a class using *...
// import static java.lang.Math.*;
/*
  ...but I would avoid this.
   - First, doing so makes code less readable.
   - Second, when you static import from an entire class,
     you import too many names that you don't know.
     Do you know all the static members of Math?!
     This opens up the possibility of name conflicts and bugs.
*/

class JavaAPI {
    public static void main(String[] args) {
        java.lang.System.out.println("System is a class in java.lang.");
        java.lang.System.out.println("It has a static field called 'out'");
        java.lang.System.out.println("which has instance methods called 'println'.");
        java.lang.System.out.println();

        // String and Math are classes in java.lang.
        final java.lang.String empty = "";
        final double E = java.lang.Math.E;


        // Importing reduces the amount we have to write...
        System.out.println(java.util.Arrays.toString(new int[] {1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println(Arrays.toString(new int[] {1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println();


        // ...as does static importing.
        System.out.println(Math.sqrt(Math.PI));
        out.println(sqrt(PI));
    }
}

/*
  One final thing to mention related to previous material...
  We've seen that fields and methods of a package-private class can be package-private.
  Giving a public class package-private fields and/or methods is likely to lead to confusion.
  That's why I have not given examples of doing this.
*/