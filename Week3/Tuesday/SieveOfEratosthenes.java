class SieveOfEratosthenes {
    public static int[] sieveOfEratosthenes(int n) {
  
      boolean is_prime[] = new boolean[n + 1];
      for (int i = 0; i <= n; i++)
        is_prime[i] = true;
  
      for (int p = 2; p * p <= n; p++) {
        if (is_prime[p] == true) {
          for (int i = p * p; i <= n; i += p)
            is_prime[i] = false;
        }
      }
  
      int num_primes = 0;
  
      for (int i = 2; i <= n; i++) {
        if (is_prime[i] == true)
          num_primes++;
      }
  
      int[] primes = new int[num_primes];
      int index = 0;
  
      for (int i = 2; i <= n; i++) {
        if (is_prime[i] == true) {
          primes[index] = i;
          index += 1;
        }
      }
      return primes;
    }
  
    public static void main(String args[]) {
      int n = 52_849_294;
      // 52849294.35816308
      int[] primes = sieveOfEratosthenes(n);
      for (int p: primes) {
        System.out.print(p + " ");
      }
      System.out.println("\n\nNumber of primes less than " + n + " are " + primes.length);
    }
  }