public class TestNestedClasses {
    public static void main(String args[]){
        //Non-Statics
        // Outer outerObj = new Outer();
        // Outer.Inner inner = outerObj.new Inner();
        // inner.test();


        //Statics
        StaticOuter.StaticInner.test(); //static classes don't need objects
    }
    
}


public class Outer {
    private int data_private = 10;
    
    public class Inner {
      public void test() {
        System.out.println("private data: " + data_private);
      }
    }
}

public class StaticOuter{

    private int data_private = 10;
    static int data_static = 3;

    public static class StaticInner{
        static void test(){
            System.out.println("data_static: "+ data_static);
            //Static inner can't access outer private
            // System.out.println("data_private: "+ data_private); 
        }
    }

}