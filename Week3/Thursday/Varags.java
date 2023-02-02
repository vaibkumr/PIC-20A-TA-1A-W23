public class Varags{

    static int add(int... nums){
        int sum = 0;
        for (int num : nums)
            sum += num;
        return sum;
    }    

    public static void main(String[] args){
        int sum = add(1, 2);
        System.out.println(sum);

        sum = add(1, 2, 3, 4, 5);
        System.out.println(sum);
        
        sum = add(new int[]{1, 2, 3, 5, 6});
        System.out.println(sum);        

    }
}