package accessModifiers;

/*
  This class contains some nice code for
  enumerating the subarrays of an array
  summing to a specified total.
  However, if you find the code intimidating,
  you can ignore the details of it.


  Here's what you are supposed to learn from this file.

   - We have not marked SubArraysSummingToTotal as "public".
     Therefore, the class SubArraysSummingToTotal is "package-private".

   - We have not marked the constructor as "public" or "private".
     Therefore, the constructor is "package-private".

   - We have not marked the 'display' method as "public" or "private".
     Therefore, the method is "package-private".


  Package-private classes, constructors, methods,
  and fields (we didn't give an example of a package-private field)
   - behave as though they are 'public' to classes in the same package;
   - behave as though they are 'private' to classes in a different package.
*/

class SubArraysSummingToTotal {
    private int[] arr; // should consist of strictly positive distinct ints
    private int   tot; // should be a positive int

    SubArraysSummingToTotal(int[] arr, int tot) {
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
