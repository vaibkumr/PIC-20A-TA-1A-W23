public class Varags {

    public void printVals(double ...vs){
        System.out.println("Calling (double ...vs)");
        for (double v: vs)
            System.out.println(v);
    }     

    public void printVals(int ...values){
        System.out.println("Calling (int ...values)");
        for (int value: values)
            System.out.println(value);
    }

    public static void printVals(boolean ...vs){
        System.out.println("Calling (boolean ...vs)");
        for (boolean v: vs)
            System.out.println(v);
    }    

    // public void printVals(int v){
    //     System.out.println("Calling (int v)");
    //     System.out.println(v);
    // } 


    public static void main(String[] args){
        Varags obj = new Varags();
        // obj.printVals(1);
        // obj.printVals(1, 2, 3);
        obj.add();
        // obj.printVals(1.1, 1.2, 1.3);
    }
}
