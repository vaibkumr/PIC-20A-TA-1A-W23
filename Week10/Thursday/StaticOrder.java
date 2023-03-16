public class StaticOrder {
    public static void main(String[] args) {
        System.out.println("==== Creating Child1 ====");
        Child child1 = new Child();
        // System.out.println("==== Creating Child2 ====");
        // Child child2 = new Child();
        //What if I create a parent before line 3?
        //What if I create a parent after line 6?
    }
}

class Parent {
    static {
        System.out.println("Static initialization block in Parent");
    }

    {
        System.out.println("Instance initialization block in Parent");
    }

    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {

    static {
        System.out.println("Static initialization block in Child");
    }


    {
        parent_data = 100;
        System.out.println("Instance initialization block in Child");
    }

    Child() {
        super();
        System.out.println("Child constructor");
    }
}