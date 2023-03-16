public class TypeConversion {


    public static void main(String[] args) {
        float f3 = 1.0;
        



        long i2 = 10l;
        int aaaa = 10l;

        float f1 = (float) i1;
        float f2 = (float) (char) (int) (char) (double) i1; //chaining type conversion 
        float f3 = 1.0;
        float f4 = 1.0f;

        int i2 = 100l;
        long l1 = 100l;


        // Polymorphic conversion
        Parent p = new Parent();
        Child c = new Child();
        GrandChild gc = new GrandChild();

        System.out.println(gc instanceof GrandChild);
        System.out.println(gc instanceof Child);
        System.out.println(gc instanceof Parent);

        System.out.println(c instanceof GrandChild);
        System.out.println(c instanceof Child);
        System.out.println(c instanceof Parent);  
        
        System.out.println(p instanceof GrandChild);
        System.out.println(p instanceof Child);
        System.out.println(p instanceof Parent);          

        // which of the following wont give errors?
        // p = c;
        // c = p;

    }
}

class Parent{
}

class Child extends Parent{
}

class GrandChild extends Child{
}