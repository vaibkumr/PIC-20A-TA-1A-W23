public class ThrowException {

        // Source: Micheal
        // Uncommenting the next line gives an ArithmeticException...
        // System.out.println(1 / 0);

        // Uncommenting the next two lines gives a StringIndexOutOfBoundsException...
        // String s = "";
        // char c = s.charAt(3);

        // Uncommenting the next two lines gives an ArrayIndexOutOfBoundsException...
        // int[] arr0 = new int[] {};
        // System.out.println(arr0[0]);

        // Uncommenting the next line gives a NegativeArraySizeException...
        // int[] arr1 = new int[-1];


    public int divide(int a, int b){
        int c = a/b;
        return c;
    }

    public int divideSafe(int a, int b){
        if(b==0){
            throw new IllegalArgumentException();
        }
        return a/b;
    }    

    public static void main(String args[]){
        ThrowException t = new ThrowException();
        // t.divide(1, 0);

        // t.divideSafe(1, 0);

        try{
            f();
        }
        catch (Exception e){
            System.out.print(e.toString());
            System.out.print("Outer exception caught");
        }
        
    }
    
}
