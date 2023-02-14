public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();


        // The following four lines
        // have nothing to do with inheritance...
        System.out.println(a.instanceField);           // 0
        System.out.println(a.staticField);             // 0

        System.out.println(a.instanceMethod());        // 0
        System.out.println(a.staticMethod());          // 0

        System.out.println();


        // In each of the following cases,
        // B's fields and methods are used...
        System.out.println(b.instanceField);           // 1
        System.out.println(b.staticField);             // 1

        System.out.println(b.instanceMethod());        // 1
        System.out.println(b.staticMethod());          // 1

        System.out.println();


        // From within B's interface,
        // we can write 'super' to make use of
        // A's fields and methods...
        b.usingSuper();                                // 0
                                                       // 0
                                                       // 0
                                                       // 0
        System.out.println();


        /*
          Fields and static methods behave differently to
          instance methods...

           - instance fields  with the same name are hidden
           -  static  fields  with the same name are hidden
           - instance methods with the same name are overridden
           -  static  methods with the same name are hidden

          (One should really say,
          "*public* instance methods with the same name are overridden".
          We'll see shortly that private instance methods are not inherited.)

          The difference between 'hide' and 'override'
          is highlighted when polymorphism is at play,
          that is, when the object type is different
          than the reference variable's type.
        */

        // (A) b is a reference of type A,
        // but it references an object of type B.
        System.out.println(((A) b).instanceField);     // 0, A's instance field
        System.out.println(((A) b).staticField);       // 0, A's  static  field

        System.out.println(((A) b).instanceMethod());  // 1, B's instance method
        System.out.println(((A) b).staticMethod());    // 0, A's  static  method

        System.out.println();


        a = b;

        // a is a reference of type A,
        // but it references an object of type B.
        System.out.println(a.instanceField);           // 0, A's instance field
        System.out.println(a.staticField);             // 0, A's  static  field

        System.out.println(a.instanceMethod());        // 1, B's instance method
        System.out.println(a.staticMethod());          // 0, A's  static  method

        System.out.println();


        /*
          One should not actively attempt to hide fields and static methods.
          However, these rules are designed so that
          if you extend from a class and accidentally hide a field or static method,
          it is less likely that you'll run into a nasty bug:
          if you're hiding accidentally,
          you don't know about the field or static method that you're hiding,
          and the rules ensure that you don't accidentally use it;
          moreover, any code in the base class that is supposed
          to use the hidden member will continue to do so.

          On the other hand, the language is designed to make heavy use of overriding.
          The last three examples show that one can access a base class's method by
          using 'super' from within the derived class's interface;
          outside the derived class's interface, this is not possible:
          you'll use the most appropriate overridden version of the method.
        */
    }
}