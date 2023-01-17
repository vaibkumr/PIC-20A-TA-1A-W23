class ControlFlow {
    /**
     * Prints the Collatz sequence starting at a specified number.
     * 
     * To obtain the next number in a Collatz sequence one
     * divides by 2, or multiplies by 3 and adds 1,
     * depending on whether the current number is even or odd,
     * repectively.
     * 
     * 1 terminates Collatz sequences.
     * 
     * @param N the first term in the sequence
    */
    public static void CollatzSequence(int N) {
        if (N < 1) {
            return;
        }

        if (N == 1) {
            System.out.println(N); return;
        }
        else {
            System.out.print(N + " ");
        }

        if (N % 2 == 0) {
            CollatzSequence(N / 2);
        }
        else {
            CollatzSequence(3 * N + 1);
        }
    }

    /**
     * Prints a diamond consisting of '*'s to the console
     * of a specified size.
     * 
     *   *    Line 1
     *  ***   Line 2
     * *****  Line 3
     *  ***   Line 4
     *   *    Line 5
     * 
     * @param N the line number of the middle of the diamond
    */
    public static void printDiamond(int N) {
        if (N < 1) { return; }

        for (int i = 1; i < N; ++i) {
            for (int j = 0; j < N - i; ++j) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2*i - 1; ++j) {
                System.out.print('*');
            }
            for (int j = 0; j < N - i; ++j) {
                System.out.print(' ');
            }
            System.out.print('\n');
        }

        for (int i = N; i >= 1; --i) {
            for (int j = 0; j < N - i; ++j) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2*i - 1; ++j) {
                System.out.print('*');
            }
            for (int j = 0; j < N - i; ++j) {
                System.out.print(' ');
            }
            System.out.print('\n');
        }
    }

    /**
     * Returns the integer part of the base 2 logarithm of an integer.
     * @param N the integer to find the logarithm of
     * @return floor(log_2(N)) or -1 if given an invalid input
    */ 
    public static int log(int N) {
        if (N < 1) { return -1; }

        int i = 0;

        while (N != 1) {
            N /= 2;
            ++i;
        }
        return i;
    }

    /**
     * Returns the N-th prime number using a slow algorithm.
     * @param N the input
     * @return the N-th prime number
    */
    public static int nthPrime(int N) {
        if (N <= 0) { return 0; }

        // we'll count how many primes we have so far 
        // we'll go through candidates one by one starting at 2
        int counter = 0;
        int candidate = 2;

        while (true) {
            // assume a candidate is prime until we find otherwise
            boolean candidateIsPrime = true;

            for (int d = 2; d < candidate; ++d) {
                // if candidate is divisible by d, 
                if (candidate % d == 0) {
                    // the candidate is not prime, 
                    candidateIsPrime = false;
                    // break from the 'for' loop
                    break;
                }
            }
            // System.out.println(d); // scope works like in C++

            // when we find our candidate is prime 
            if (candidateIsPrime) {
                // we increase the counter and if it is N,
                if (++counter == N) {
                    // we return the candidate 
                    return candidate;
                }
            }
            ++candidate; // next candidate
        }
    }

    // It is important to test all the code that you write...
    public static void main(String[] args) {
        CollatzSequence(3);
        CollatzSequence(13);

        printDiamond(3);
        printDiamond(8);

        System.out.println(log(31));
        System.out.println(log(32));
        System.out.println(log(33));

        System.out.println(nthPrime(100));
    }
}
