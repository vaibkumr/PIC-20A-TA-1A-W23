public class StaticBlock {
    public static void main(String[] args) {
        MyClass c1 = new MyClass();
        MyClass c2 = new MyClass();
        MyClass c3 = new MyClass();
      
    }
}

class MyClass {

    {
        System.out.println("Instance initialization block");
    }    

    static {
        System.out.println("Static initialization block");
    }
    
    public MyClass(){
        System.out.println("Constructor called!");
    }
     
}
