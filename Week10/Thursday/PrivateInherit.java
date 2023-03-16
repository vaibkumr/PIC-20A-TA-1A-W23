public class PrivateInherit {
    public static void main(String[] args) {
        Child child = new Child();
        child.publicMethod();
    }
}

class Parent {
    private void privateMethod() {
        System.out.println("Private method in Parent");
    }

    void publicMethod() {
        System.out.println("Public method in Parent");
        privateMethod();
    }
}

class Child extends Parent {
    // what if I uncomment the following?
    // @Override 
    private void privateMethod() {
        System.out.println("Private method in Child");
    }

    @Override
    void publicMethod() {
        System.out.println("Public method in Child");
        privateMethod();
    }
}


