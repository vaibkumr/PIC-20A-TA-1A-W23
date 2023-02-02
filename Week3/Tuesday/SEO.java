public class SEO {
    public static void sieveOfEratosthenes(int n){
        boolean is_prime[] = new boolean[n];
        for(int i=0; i<n; i++)
            is_prime[i] = true;
        is_prime[0] = false;
        is_prime[1] = false;

        for(int i=0; i*i<n; i++){
            if(is_prime[i]==true){
                for(int j=i*i; j<n; j+=i){
                    is_prime[j] = false;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(is_prime[i]==true){
                System.out.print(i+" ");
            }
        }
    }
     
    public static void main(String args[]){
        int n = 100;
        sieveOfEratosthenes(n);
    }    
}
