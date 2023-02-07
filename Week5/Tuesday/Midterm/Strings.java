class Strings {
    /*
      String is an object type, not a primitive type.

      However...
       - Strings have special support such as
         - String literals;
         - the + operator.

      Moreover...
       - Strings are immutable.
       - To change a String,
         you have to create a new one
         with the desired changes.

      All of these properties make Strings feel
      closer to primitives than other objects,
      but some care is still needed.


      Aside...
      The immutability of Strings
      can feel like a strange choice
      when one considers efficiency.
      The classes StringBuilder and StringBuffer
      behave more like a std::vector<char> in C++.
      StringBuilder is not thread safe, but faster.
      StringBuffer is thread safe, but slower.
    */


    public static void main(String[] args) {
        String s0 = "s";
        String s1 = "s";
        System.out.println(s0 == s1);
        /*
          What?!

          Strings literals which look the same
                   - e.g. "s" and "s" -
          represent references to the same String object,
          the "canonical" String object
          containing the specified characters.

          In the case above,
          we're asking s0 and s1 to reference
          the canonical String object containing
          the single character 's'.

          Using + with literals will result in a
          compile-time calculation producing a reference
          to a canonical String object...
        */
        System.out.println("st" + "ring" == "str" + "ing");
        System.out.println(88 + "8" + 88 == 8 + "8" + 888);


        // However, frequently there are many
        // distinct String objects with the same value...
        String s2 = "";
        String s3 = "";

        s2 += 's';
        s3 += 's';
        /*
          These calculations involving +=
          force the creation of new objects.
          The lines of code don't know about each other,
          so we're left with two new distinct String objects.

          Similarly, by the end of the following calculations
          we have nine distinct String objects referenced by
          s1, s2, s3, s4, s5, s6, s7, s8, s9.
        */

        String s4 = s0 + "";
        String s5 = s0 + "";

        String s6 = new String(s0);
        String s7 = new String(s0);

        String s8 = new String(new char[] {'s'});
        String s9 = new String(new char[] {'s'});

        String[] strings = { s0, s1, s2, s3, s4, s5, s6, s7, s8, s9 };

        for (int i = 0; i <= 8; ++i) {
            for (int j = i + 1; j <= 9; ++j) {
                if (strings[i] == strings[j]) {
                    System.out.println("s" + i + " == s" + j);
                }
            }
        }

        /*
          However, all of these objects
          store a String containing
          the single character 's'.

          Normally, one does not care about whether
          String objects are distinct or not,
          only whether they have the same value.
          Therefore, usually you'll want to avoid ==
          for Strings and use 'equals' to compare them.
        */
        boolean allObjectsHaveSameValue = true;

        for (int i = 0; i <= 8; ++i) {
            for (int j = i + 1; j <= 9; ++j) {
                if (!strings[i].equals(strings[j])) {
                    allObjectsHaveSameValue = false;
                }
            }
        }

        if (allObjectsHaveSameValue) {
            System.out.println("all of the String objects " +
                               "have the same value");
        }
    }
}
