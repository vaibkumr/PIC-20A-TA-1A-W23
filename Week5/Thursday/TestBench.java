public class TestBench {
    public static void main(String[] args){
        testHashFunctions();
        testEquals();
        testToString();
    }
    
    public static void testVisibility(){
        Child c = new Child();
        c.testPublic();
        c.testProtected();
        c.testSharedData();

    }

    public static void testInstanceOf(){
        Parent p = new Parent();
        Child c = new Child();

        System.out.println(c instanceof Child);
        System.out.println(c instanceof Parent);

        System.out.println(p instanceof Child);
        System.out.println(p instanceof Parent);

    }

    public static void testToString(){
        Child c1 = new Child();
        Child c2 = new Child(3, 2, 1);
        System.out.println(c1);
        System.out.println(c2);

    }    

    public static void testEquals(){
        Child c1 = new Child();
        Child c2 = new Child();
        System.out.println(c1.equals(c1));
        System.out.println(c2.equals(c2));
        System.out.println(c1.equals(c2));

    }

    public static void testHashFunctions(){
        // http://hg.openjdk.java.net/jdk8u/jdk8u/jdk/file/a71d26266469/src/share/classes/java/lang/Object.java#l100
        // http://hg.openjdk.java.net/jdk8u/jdk8u/hotspot/file/87ee5ee27509/src/share/vm/runtime/synchronizer.cpp#l601
        Child c1 = new Child();
        Child c2 = new Child();
        System.out.println(c1.hashCode());
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
    
}


class Parent{
    public int parent_public_data;
    protected int parent_protected_data;
    private int parent_private_data;
    public int shared_data = 100;

    Parent(){
        System.out.println("<Parent Constructor `Parent()`>");
        this.parent_public_data = 1;
        this.parent_protected_data = 2;
        this.parent_private_data = 3;
    }

    Parent(int parent_public_data, int parent_protected_data, int parent_private_data){
        System.out.println("<Parent Constructor `Parent(int, int, int)`>");
        this.parent_public_data = parent_public_data;
        this.parent_protected_data = parent_protected_data;
        this.parent_private_data = parent_private_data;
    }
}

class Child extends Parent{
    int shared_data = 10;

    Child(){
        super(100, 200, 300);
        System.out.println("<Child Constructor `Child()`>");
    }

    Child(int a, int b, int c){
        super(a, b, c);
        System.out.println("<Child Constructor `Child()`>");
    }    

    void testPublic(){
        System.out.println("parent_public_data: "+parent_public_data);
    }

    void testProtected(){
        System.out.println("parent_protected_data: "+parent_protected_data);
    }

    void testSharedData(){
        //Importance of `this` and `super`
        System.out.println("Child's shared data: "+this.shared_data);
        System.out.println("Parent's shared data: "+super.shared_data);
    }

    public String toString() {
        return "I am a child with parent's values: " +
                parent_public_data + " " +
                parent_protected_data + " ";
    }
}