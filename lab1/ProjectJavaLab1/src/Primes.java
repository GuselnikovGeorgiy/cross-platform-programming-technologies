public class Primes {
    public static boolean isPrime(int n) {
        if (n % 2 == 0) {
            return n == 2;
        }
        int d = 3;
        while (d*d <= n && n % d != 0)
            d+=2;
        return d*d > n;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 100; ++i) {
            if (isPrime(i))
                System.out.println(i + " - Prime number");
        }
    }

}