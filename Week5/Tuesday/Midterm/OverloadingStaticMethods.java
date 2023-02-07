class OverloadingStaticMethods {
    public static void main(String[] args) {
        /*
          MATH

          JAVA comes with a class called Math
          that stores many useful static member functions.

          https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html
        */
        System.out.println( Math.ceil(7.2)  );
        System.out.println( Math.cos(0)     );
        System.out.println( Math.acos(-1)   );
        System.out.println( Math.exp(1)     );
        System.out.println( Math.max(8, 88) );
        System.out.println( Math.pow(2, 3)  );
        System.out.println( Math.round(7.8) );
        System.out.println( Math.round(8.2) );
        System.out.println( Math.sqrt(64)   );

        System.out.println( "" );


        /*
          By writing static member functions,
          we can imitate writing ordinary functions in C++.

          The basics are the same as C++,
          and overloading works well.
        */
        overloaded(8);
        overloaded(8, 8);
        overloaded("8");

        System.out.println( "" );

        byte   b = 8;      TypeTester.printType(b);
        short  s = 88;     TypeTester.printType(s);
        int    i = 888;    TypeTester.printType(i);
        long   l = 8888;   TypeTester.printType(l);
        float  f = 88888;  TypeTester.printType(f);
        double d = 888888; TypeTester.printType(d);
    }


    public static void overloaded(int num) {
        System.out.println("overloaded(int) called");
    }


    public int overloaded(int a, int b) {
        System.out.println("overloaded(int, int) called");
        return 0;
    }

    public static void overloaded(String str) {
        System.out.println("overloaded(String) called");
    }
}
