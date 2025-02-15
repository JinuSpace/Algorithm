import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] T = new int[N];
        int[] P = new int[N]; 
        int[] dp = new int[N + 1];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int nextDay = i + T[i];
            if (nextDay <= N) { 
                dp[nextDay] = Math.max(dp[nextDay], dp[i] + P[i]);
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]); 
        }

        System.out.println(dp[N]);
    }
}
