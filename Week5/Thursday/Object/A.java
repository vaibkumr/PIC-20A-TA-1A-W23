public class A // extends Object
               // If we don't explicitly extend a class, the class extends java.lang.Object.
{
    public A(int i) {
        // super()
        // If we don't type anything, it is as though we typed super().

        System.out.println("A's (int) constructor called with argument " + i);
    }

    public String toString() {
        String askedTo       = "Asked toString an instance of A...";
        String superToString =                                   "          super.toString() == " + super.toString();
        String expression    = "getClass().getName() + '@' + Integer.toHexString(hashCode()) == " + 
                                getClass().getName() + '@' + Integer.toHexString(hashCode());

        return askedTo + superToString + "\n" + expression;
    }
}
