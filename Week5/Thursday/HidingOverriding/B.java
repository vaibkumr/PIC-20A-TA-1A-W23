public class B extends A {
    public        int instanceField = 1;
    public static int   staticField = 1;

    public        int instanceMethod() { return 1; }
    public static int   staticMethod() { return 1; }

    public void usingSuper() {
        System.out.println(super.instanceField);
        System.out.println(super.staticField);
        System.out.println(super.instanceMethod());
        System.out.println(super.staticMethod());
    }
}