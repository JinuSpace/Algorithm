import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int recursionFiboCount = 0;
    public static int dpFiboCount = 0;
    public static int recursionFibo(int n) {
        if (n == 1 || n == 2) {
            recursionFiboCount ++;
            return 1;
        }
        return recursionFibo(n - 1) + recursionFibo(n - 2);
    }

    public static int dpFibo(int n) {
        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dpFiboCount ++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        recursionFibo(n);
        dpFibo(n);
        System.out.println(recursionFiboCount + " " + dpFiboCount);

    }
}