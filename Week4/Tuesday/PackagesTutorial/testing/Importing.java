package testing;


import accessModifiers.ArrayFunctions;
import accessModifiers.ArrayFuncsOneFile;

// import accessModifiers.SubArrays;
/*
  Not allowed! The error message reads...

  "SubArrays is not public in accessModifiers;
  cannot be accessed from outside package"
*/

// import accessModifiers.SubArraysSummingToTotal;
/*
  Not allowed! The error message reads...

  "SubArraysSummingToTotal is not public in accessModifiers;
  cannot be accessed from outside package"
*/


class Importing {
    public static void main(String[] args) {
        /*
          Because we imported accessModifiers.ArrayFunctions,
          we now only have to type ArrayFunctions.
        */
        ArrayFunctions.printSubArrays(new int[] {1, 2, 3});
        System.out.print('\n');

        ArrayFunctions.printSubArrays(new int[] {1, 2, 3, 4}, 2);
        System.out.print('\n');

        // Similarly for ArrayFuncsOneFile...
        ArrayFuncsOneFile.printSubArraysSummingToTotal(new int[] {1, 2, 3, 4, 5, 6, 7}, 8);
        System.out.print('\n');


        // accessModifiers.SA sa;
        // accessModifiers.SASTT sastt;
        /*
          Before compiling ArrayFuncsOneFile.java and
          without importing accessModifiers.ArrayFuncsOneFile,
          we get "cannot find symbol".

          If we've compiled ArrayFuncsOneFile.java or
          if we have imported accessModifiers.ArrayFuncsOneFile,
          we get "{SA or SASTT} is not public in accessModifiers;
          cannot be accessed from outside package".
        */
    }
}