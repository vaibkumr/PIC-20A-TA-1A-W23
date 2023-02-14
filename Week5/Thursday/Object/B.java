public class B extends A {
    public B() {
        super(0);
        System.out.println("B's default constructor called");
    }

    public B(int i) {
        super(1);
        System.out.println("B's (int) constructor called");
    }

    public B(int i, int j) {
        super(2);
        System.out.println("B's (int, int) constructor called");
    }

    public String toString() {
        return "Asked toString an instance of B";
    }
}