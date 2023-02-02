package accessModifiers;

/*
  This code rewrites the previous three files in one file:
  ArrayFuncsOneFile is just ArrayFunctions with a different name;
  SA is just SubArrays with a different name;
  SASTT is just SubArraysSummingToTotal with a different name.

  ArrayFuncsOneFile is marked "public".
   - We will be able to use it
     outside of the 'accessModifiers' package.

  SA, SASTT, their constructors,
  and their 'display' methods are package-private.
   - We will not be able to use them outside of this package.
   - However, they are in the same package as ArrayFuncsOneFile,
     so ArrayFuncsOneFile can use them.
*/

public class ArrayFuncsOneFile {
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
        (new SA(arr)).display();
    }

    /**
     * Prints all subarrays of a specified array of a specified size.
     * @param arr the array to print subarrays of
     * @param sz  the size of the subarrays
    */
    public static void printSubArrays(int[] arr, int sz) {
        (new SA(arr)).display(sz);
    }

    /**
     * Prints all subarrays of a specified array summing to a specified total.
     * @param arr the array to print subarrays of;
     *            should consist of strictly positive distinct ints
     * @param tot the total the subarrays sum to;
     *            should be a positive int
    */
    public static void printSubArraysSummingToTotal(int[] arr, int tot) {
        (new SASTT(arr, tot)).display();
    }
}

class SA {
    private int[] arr;

    SA(int[] arr) {
        this.arr = arr;
    }

    void display() {
        int len = arr.length;

        for (int i = 0; i <= len; ++i) {
            display(i);
        }
    }
    void display(int i) {
        int[] sub = new int[i];
        help(sub, i, 0);
    }

    private void help(int[] found, int toFind, int start) {
        if (toFind == 0) {
            System.out.println(java.util.Arrays.toString(found));
            return;
        }
        int stop = arr.length - toFind;

        for (int i = start; i <= stop; ++i) {
            found[found.length - toFind] = arr[i];
            help(found, toFind - 1, i + 1);
        }
    }
}

class SASTT {
    private int[] arr; // should consist of strictly positive distinct ints
    private int   tot; // should be a positive int

    SASTT(int[] arr, int tot) {
        this.arr = arr;
        this.tot = tot;
    }

    void display() {
        int[] sub = new int[arr.length];
        help(sub, 0, 0);
    }

    private void help(int[] sub, int count, int start) {
        if (sum(sub) > tot) {
            return;
        }
        if (sum(sub) == tot) {
            printUntilZero(sub);
            return;
        }
        int len = arr.length;

        for (int i = start; i < len; ++i) {
            sub[count] = arr[i];
            help(sub, count + 1, i + 1);
            sub[count] = 0;
        }
    }

    private static int sum(int[] a) {
        int tot = 0;
        for (int val : a) { tot += val; }
        return tot;
    }

    private static void printUntilZero(int[] a) {
        if (a.length == 0 || a[0] == 0) {
            System.out.println("[]");
            return;
        }

        int len = a.length;
        System.out.print("[" + a[0]);

        for (int i = 1; i < len; ++i) {
            if (a[i] != 0) {
                System.out.print(", " + a[i]);
            }
            else {
                break;
            }
        }
        System.out.println("]");
    }
}
