public class Hello {
    public static void f(int b, int[] a){
        b = 100;
        a = new int[]{1, 2, 3};
        a[0] = 5;
        System.out.println(a[0]+ "<---");
    }
    public static void main(String[] args){
        int b = 10;
        int[] a = new int[]{0, 1, 3};
        f(b, a);
        System.out.println(b);
        System.out.println(a[0]);
        
    }
}

