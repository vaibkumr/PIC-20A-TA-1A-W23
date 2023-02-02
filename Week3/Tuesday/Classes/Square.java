/*
  We've just made classes called Circle, Rectangle, Triangle.
  In all of these cases, the name refers to the geometric shape
  of the same name.

  Here, we write a class called Square,
  but it is not for storing the information of a shape.
  It is a class for storing an array of array of values
  which allows users to 'get' and 'set' values
  and test whether their array of arrays is a magic square.
*/


class Square {
    /*
      fields...

      All fields have been marked 'final'.
      After creating an instance of a Square,
      we do not wish for its size to change.
      Therefore, the magic total will remain the same.
      Also, 'values' will always refer to the same array
      even if the values stored in that array do change.
    */
    public  final int size;
    private final int magicTotal;
    private final int[][] values;

    /*
      constructor...

      Since our fields have been marked 'final',
      they must be initialized by the end of construction.
      There are a couple of other ways to initialize final fields.
      We'll discuss them shortly.
    */
    Square(int size) {
        this.size       = size;
        this.magicTotal = (size * (size * size + 1)) / 2;
        this.values     = new int[size][size];
    }

    // methods...
    public String toString() {
        String s = "[";

        for (int i = 0; i < values.length; ++i) {
            if (i > 0) {
                s += ' ';
            }
            s += java.util.Arrays.toString(values[i]);

            if (i < values.length - 1) {
                s += '\n';
            }
        }
        return s + "]";
    }

    public int get(int row, int col) {
        return this.values[row][col];
    }
    public void set(int row, int col, int val) {
        this.values[row][col] = val;
    }

    public boolean isMagic() {
        // You are asked to write a similar function on HW1
        // so you could fill this definition in correctly,
        // if you like...
        return false;
    }
}
