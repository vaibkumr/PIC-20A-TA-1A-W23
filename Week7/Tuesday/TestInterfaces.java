public class TestInterfaces implements MyInterface{

    @Override
    public void defaultMethodOverride(){
        System.out.println("overridden!");
    }

    @Override //https://stackoverflow.com/questions/4822954/do-we-really-need-override-and-so-on-when-code-java
    public void method2(){
        System.out.println("method2!");
    }
    
    @Override
    public void method1(){
        System.out.println("method1!"+this.a);
    }    

    public static void main(String[] args){
        TestInterfaces obj = new TestInterfaces();
        obj.method1();
        obj.method2();
        obj.defaultMethod();
        obj.defaultMethodOverride();
    }
    
}


public interface MyInterface {

    int a = 10;
    //Try things here... private methods? concrete methods? data members?
    abstract void method2(); 
    void method1(); //all interface methods are implicitly abstract

    default void defaultMethod(){
        System.out.println("test");
    }

    default void defaultMethodOverride(){
        System.out.println("test");
    }    

}

// public interface MyInterface2 {
//     void i2_method1(); 

// }