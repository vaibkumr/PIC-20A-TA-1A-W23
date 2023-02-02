package accessModifiers;

/*
  This class contains some nice code for
  enumerating the subarrays of an array.
  However, if you find the code intimidating,
  you can ignore the details of it.


  Here's what you are supposed to learn from this file.

   - We have not marked SubArrays as "public".
     Therefore, the class SubArrays is "package-private".

   - We have not marked the constructor as "public" or "private".
     Therefore, the constructor is "package-private".

   - We have not marked either 'display' method as "public" or "private".
     Therefore, both methods are "package-private".


  Package-private classes, constructors, methods,
  and fields (we didn't give an example of a package-private field)
   - behave as though they are 'public' to classes in the same package;
   - behave as though they are 'private' to classes in a different package.
*/

class SubArrays {
    private int[] arr;

    SubArrays(int[] arr) {
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
