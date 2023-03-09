public class ThrowsExample{

    static void f() throws MyException {
        System.out.println("Before");
        throw new MyException("this is an exception, something is wrong."); //invoking/throwing exception
    }

    static void f2() throws PIC20AExampleException{
        //Checking means:
        // 1. Either use throws keyword
        // 2. Use explicit try catch blocks
        throw new PIC20AExampleException("this is an exception, something is wrong."); //invoking/throwing exception
    }
    

    static public void main(String args[]){
        try{
            f();
        }
        catch(MyException e){
            System.out.println("EXCEPTION HANDLE");
        } 
    }
}


class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class PIC20AExampleException extends RuntimeException {
    public PIC20AExampleException(String message){
        super(message);
    }
}