class Collatz {
    public static int next(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }
        return 3 * n + 1;
    }

    public static String sequence(int n) {
        if (n < 1) {
            return "";
        }

        String s = "" + n;

        while (n != 1) {
            n = next(n);
            s += " " + n;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sequence(3));
    }
}