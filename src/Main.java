import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean[] primes = new boolean[101];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i * i <= 100; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= 100; j += i) {
                    primes[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to 100:");
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static List<Integer> findPrimesUpTo(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        return Arrays.asList(Integer.toString(2).split("\\s+").mapToInt(Integer::parseInt));
    }
}
