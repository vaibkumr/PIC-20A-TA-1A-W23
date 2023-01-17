class VariablesOfPrimitiveType {
    public static void main(String[] args) {
        /*
          PRIMITIVE TYPES
          Java has 8 primitive types:
          byte, short, int, long, boolean, double, float, char.

          The class String feels quite close to a primitive type.

          https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        */

        byte minByte = -128; // -2^7
        byte maxByte =  127; //  2^7 - 1

        short minShort = -32_768; // -2^15
        short maxShort =  32_767; //  2^15 - 1

        int minInt = -2_147_483_648; // -2^31
        int maxInt =  2_147_483_647; //  2^31 - 1

        long minLong = -9_223_372_036_854_775_808L; // -2^63
        long maxLong =  9_223_372_036_854_775_807L; //  2^63 - 1

        // System.out.println(minByte);
        // System.out.println(maxByte);
        // System.out.println(minShort);
        // System.out.println(maxShort);
        // System.out.println(minInt);
        // System.out.println(maxInt);
        // System.out.println(minLong);
        // System.out.println(maxLong);

        /*
          For each {data type},
          what happens if you try to initialize using a value
          outside of the range [min{data type}, max{data type}]?
        */


        boolean t = true;  // the only
        boolean f = false; // possible values

      /*
        System.out.println(t);
        System.out.println(f);
      */


        // Doubles are stored using 64-bits: 
        // https://en.wikipedia.org/wiki/Double-precision_floating-point_format
        double d1 = 1;
        double d2 = 0.5;
        double d3 = 1.0625E2;
        double d4 = 1.000_000_000_000_001;
        double d5 = 1.000_000_000_000_00011;

      /*
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
      */
        System.out.println(d1 == d4); // false is printed
        System.out.println(d1 == d5); // true is printed, *not* false, because 
                                      // telling 1 and 1.0000000000000001
                                      // apart requires more significant bits than doubles have


        // Floats are stored using 32-bits: 
        // https://en.wikipedia.org/wiki/Single-precision_floating-point_format
        float f1 = 1;
        float f2 = 0.5F;
        float f3 = 1.0625E2F;
        float f4 = 16_777_217;

      /*
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
      */
        System.out.println(f4); // 1.6777216E7 is printed, *not* 1.6777217E7, because 16,777,217 == 2^24 + 1
                                // requires too many significant bits to be stored as a float


        char minChar = 0;
        char maxChar = 65_535;
        char ch; // a 16-bit unicode character

        // 16-bit unicode encoding extends the ASCII table you learned about in 10A:
        // https://en.cppreference.com/w/cpp/language/ascii

        ch = 80; System.out.print(ch);
        ch = 73; System.out.print(ch);
        ch = 67; System.out.print(ch);
        ch = 50; System.out.print(ch);
        ch = 48; System.out.print(ch);
        ch = 65; System.out.println(ch);

        ch = 'P'; System.out.print(ch);
        ch = 'I'; System.out.print(ch);
        ch = 'C'; System.out.print(ch);
        ch = '2'; System.out.print(ch);
        ch = '0'; System.out.print(ch);
        ch = 'A'; System.out.println(ch);


        String str = "The PIC course on JAVA is also known as \"PIC20A\"";
        System.out.println(str);


        /*
          LITERALS

          1234 is an int literal.
          We can use an L to indicate a long literal (see the declaration of minLong and maxLong).

          0.5 is a double literal.
          We can use an F to indicate a float literal (see the declaration of f2 and f3).
          We can use E for scientific notation (see the declaration of d3 and f3).

          For all numbers, we can use _s to make the number clearer.
          There are various rules about the allowable positions of an _.

          true and false are boolean literals.
          'a' and '\'' are char literals.
          "a" and "\"" are string literal.

          Finally, we can use 0b and 0x for binary and hexidecimal.
        */

        int bin = 0b0111_1111; // 64 + 32 + 16 + 8 + 4 + 2 + 1 == 127
        int hex = 0x7F;        // A --> 10, B --> 11, ..., F --> 15; 7 * 16 + 15 == 127

        System.out.println(bin);
        System.out.println(hex);


        /*
          INITIALIZATION
          It is an error to use a variable before it is initialized.
        */
        int i;
        // System.out.println(i); // compiler-time error

        i = 8;
        System.out.println(i);


        /*
          'final'
          One can use the 'final' keyword 
          to make a variable const.
          However, unlike in C++, 
          one can initialize a final variable
          separately from its declaration.
        */
        final double PI = 3.141_592_653_589_793_238;
        final double PHI; PHI = 1.618_033_988_749_894_848; // initialized after declaration

        // PI = 4;      // compiler-time error
        // PHI = 1.618; // compiler-time error

        System.out.println(PI);
        System.out.println(PHI);


        /*
          NAMING VARIABLES
          One must avoid reserved keywords:
          abstract, class, continue, else, for, int, new, static, etc.

          You can see that variables normally use lowercase or mixedCase
          and that constants use CAPITALS.
        */


        /*
          OPERATORS
          ==, !=, +, -, *, /, %, +=, -=, *=, /*, %=, ++, --, &&, || work exactly as for C++.

          Although (as we'll see in the next snippet)
          JAVA is careful about narrowing conversions,
          overflow can still occur.
        */
        System.out.println(maxInt + maxInt);
        System.out.println(maxLong + maxLong);
        System.out.println(maxInt * maxInt);
    }
}
