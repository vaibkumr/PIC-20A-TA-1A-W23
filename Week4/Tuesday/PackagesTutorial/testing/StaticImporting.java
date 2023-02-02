package testing;

/*
  - Importing.java gave examples of importing classes.

  - It does not make sense to import
    an instance field or an instance method of a class
    without importing all information of the class.

  - However, it can make sense to import
    a *static* field or a *static* method of a class
    without necessarily importing all of the class.
    Such an import is called a "static import".
*/

import static accessModifiers.ArrayFunctions.print;
import static accessModifiers.ArrayFuncsOneFile.printSubArrays;
import static accessModifiers.ArrayFuncsOneFile.printSubArraysSummingToTotal;

class StaticImporting {
    public static void main(String[] args) {
        // Now we can type 'print'
        // to use accessModifiers.ArrayFunctions.print.
        print(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
        System.out.print('\n');


        // Now we can type 'printSubArrays'
        // to use accessModifiers.ArrayFuncsOneFile.printSubArrays.
        printSubArrays(new int[] {1, 2, 3});
        System.out.print('\n');

        printSubArrays(new int[] {1, 2, 3, 4}, 2);
        System.out.print('\n');


        // Now we can type 'printSubArraysSummingToTotal'
        // to use accessModifiers.ArrayFuncsOneFile.printSubArraysSummingToTotal.
        printSubArraysSummingToTotal(new int[] {1, 2, 3, 4, 5, 6, 7}, 8);
        System.out.print('\n');
    }
}