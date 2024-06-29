import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int minPrime = -1;
        boolean foundPrime = false;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                if (!foundPrime) {
                    minPrime = i;
                    foundPrime = true;
                }
                sum += i;
            }
        }

        if (!foundPrime) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }
    }
}