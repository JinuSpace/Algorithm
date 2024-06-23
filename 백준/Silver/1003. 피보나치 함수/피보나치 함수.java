import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int print0 = 0;
    static int print1 = 0;
    static int[] dp0;
    static int[] dp1;

    public static void fibonacci(int n) {
        dp0 = new int[n + 1];
        dp1 = new int[n + 1];

        dp0[0] = 1; // 0은 한 번 호출됨
        dp1[0] = 0;
        if (n > 0) {
            dp0[1] = 0;
            dp1[1] = 1; // 1은 한 번 호출됨
        }

        for (int i = 2; i <= n; i++) {
            dp0[i] = dp0[i - 1] + dp0[i - 2];
            dp1[i] = dp1[i - 1] + dp1[i - 2];
        }

        print0 = dp0[n];
        print1 = dp1[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            fibonacci(Integer.parseInt(br.readLine()));
            System.out.println(print0 + " " + print1);
            print0 = 0;
            print1 = 0;
        }
    }
}