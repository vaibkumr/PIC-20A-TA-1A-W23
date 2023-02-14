public class Tutorial {
    public static void main(String[] args) {
        /*
          In this snippet we learn about:
           - implicit calls to super()
           - java.lang.Object
           - constructor chaining
           - instanceof
          and we consider 'toString' and 'equals' with new eyes.


          CALLS TO SUPER

          The class B extends A. It has three constructors.
          The definition of each of them starts with
          a call to 'super' using one argument.
          This makes sense because A has a single constructor
          with one parameter.

          What happens if we don't make a call to 'super'?
          Unless we invoke another constructor by using 'this',
          super() will be called automatically.

          The class C extends B. It has one constructor.
          Its definition does not start with 'this' or 'super'.
          However, when we call new C(0, 0) below,
          we see evidence that B's default constructor is called.
          This proves that super() has been called.


          OBJECT

          What about a class like A which doesn't inherit from anything?
          Well, actually, what we just said is false.
          If a class does not *explicitly* inherit from anything,
          then it implicitly inherits from java.lang.Object.

          The class A does not explicitly extend another class,
          so it extends from Object. A has one constructor.
          Its definition does not start with 'this' or 'super',
          so super() is called, that is, it calls the default
          constructor of java.lang.Object.


          CONSTRUCTOR CHAINING

          You can now see that a constructor of a derived class
          will end up calling a constructor of
          its most immediate superclass.

          In our example, the constructor of C
          calls the default constructor of B;
          this calls the constructor of A
          which calls the default constructor of java.lang.Object.

          This sequence of events is called constructor chaining;
          java.lang.Object ends the chain:
          a call to the default constructor of Object
          does not call any other constructor.
        */

        A c = new C(0, 0);   System.out.println();
        A b = new B(1);      System.out.println();
        A a = new A(2);      System.out.println();


        /*
          instanceof
          The relational operator instanceof checks the type of an object.
        */

        System.out.println(c instanceof C);       // true
        System.out.println(c instanceof B);       // true
        System.out.println(c instanceof A);       // true
        System.out.println(c instanceof Object);  // true
        System.out.println();

        System.out.println(b instanceof C);       // false
        System.out.println(b instanceof B);       // true
        System.out.println(b instanceof A);       // true
        System.out.println(b instanceof Object);  // true
        System.out.println();

        System.out.println(a instanceof C);       // false
        System.out.println(a instanceof B);       // false
        System.out.println(a instanceof A);       // true
        System.out.println(a instanceof Object);  // true
        System.out.println();

        System.out.println( new int[0]  instanceof int[]);   // true
        System.out.println( new int[0]  instanceof Object);  // true
        System.out.println("string lit" instanceof String);  // true
        System.out.println("string lit" instanceof Object);  // true
        System.out.println();


        /*
          getClass, toString, clone, equals

          java.lang.Object has methods:
           - Class<?> getClass()
           - String   toString()
           - Object   clone()
           - boolean  equals(Object obj)
        */

        // https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#getClass() !!!
        System.out.println(c.getClass());
        System.out.println(b.getClass());
        System.out.println(a.getClass());
        System.out.println();


        // https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#toString()
        System.out.println(c); // uses B's 'toString' method
        System.out.println(b); // uses B's 'toString' method
        System.out.println(a); // uses A's 'toString' method which gives information on Object's 'toString' method
        System.out.println();


        // https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#clone()
        int[][] arr0 = new int[][] {{0}};
        int[][] arr1 = arr0.clone();      // only makes a shallow copy

        arr1[0][0] = 1;
        System.out.println(arr0[0][0] == arr1[0][0]);

        System.out.println();


        /*
          Defining 'equals' correctly is actually quite difficult.
          https://www.artima.com/articles/how-to-write-an-equality-method-in-java

          What I did before

              public boolean equals(Point2D p)
              public boolean equals(Triangle t)
              public boolean equals(MathVector other)

          was not good for many reasons noted in the linked article.

          Code written by Java for collections of Point2D, Triangles, and MathVectors
          will make use of Polymorphic references from Object and 'hashcodes'.
          Therefore our 'equals' method should accommodate inheritance correctly,
          and come paired with a definition of 'hashCode'.

          Notice that the example classes below have final fields.
          As soon as we have mutable fields, it is better to write
          a method with a different name for comparison purposes.
        */
        // https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals(java.lang.Object)


        Rectangle       r  = new Rectangle(4, 4);
        Square          s  = new Square(4);
        RectangularMass rm = new RectangularMass(4, 4, 28);
        SquareMass      sm = new SquareMass(4, 28);

        System.out.println( r.equals(r) + " " +  r.equals(s) + " " +  r.equals(rm) + " " +  r.equals(sm));
        System.out.println( s.equals(r) + " " +  s.equals(s) + " " +  s.equals(rm) + " " +  s.equals(sm));
        System.out.println(rm.equals(r) + " " + rm.equals(s) + " " + rm.equals(rm) + " " + rm.equals(sm));
        System.out.println(sm.equals(r) + " " + sm.equals(s) + " " + sm.equals(rm) + " " + sm.equals(sm));
        System.out.println();


        r  = new Rectangle(2, 4);
        s  = new Square(4);
        rm = new RectangularMass(2, 4, 28);
        sm = new SquareMass(4, 28);

        System.out.println( r.equals(r) + " " +  r.equals(s) + " " +  r.equals(rm) + " " +  r.equals(sm));
        System.out.println( s.equals(r) + " " +  s.equals(s) + " " +  s.equals(rm) + " " +  s.equals(sm));
        System.out.println(rm.equals(r) + " " + rm.equals(s) + " " + rm.equals(rm) + " " + rm.equals(sm));
        System.out.println(sm.equals(r) + " " + sm.equals(s) + " " + sm.equals(rm) + " " + sm.equals(sm));
    }
}
