package accessModifiers;

/*
  This class is marked "public".
  We will be able to use it outside
  of the 'accessModifiers' package.

  This class is able to use the classes
  SubArrays and SubArraysSummingToTotal
  and their 'display' methods.

  This is because...
   - SubArrays, SubArraysSummingToTotal, their constructors,
     and their 'display' methods are all package-private;
   - they're in the same package as this class;
   - therefore, to this class,
     they behave as though they're public.
*/

public class ArrayFunctions {
    /**
     * Prints a specified array.
     * @param arr the array to print
    */
    public static void print(int[] arr) {
        System.out.println(java.util.Arrays.toString(arr));
    }

    /**
     * Prints all subarrays of a specified array.
     * @param arr the array to print subarrays of
    */
    public static void printSubArrays(int[] arr) {
        (new SubArrays(arr)).display();
    }

    /**
     * Prints all subarrays of a specified array of a specified size.
     * @param arr the array to print subarrays of
     * @param sz  the size of the subarrays
    */
    public static void printSubArrays(int[] arr, int sz) {
        (new SubArrays(arr)).display(sz);
    }

    /**
     * Prints all subarrays of a specified array summing to a specified total.
     * @param arr the array to print subarrays of;
     *            should consist of strictly positive distinct ints
     * @param tot the total the subarrays sum to;
     *            should be a positive int
    */
    public static void printSubArraysSummingToTotal(int[] arr, int tot) {
        (new SubArraysSummingToTotal(arr, tot)).display();
    }
}