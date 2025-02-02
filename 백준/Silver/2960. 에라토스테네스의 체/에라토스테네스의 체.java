import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        boolean[] isPrime = new boolean[N + 1];

        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i; j <= N; j += i) {
                    if (!isPrime[j]){
                        continue;
                    }
                    isPrime[j] = false;
                    count++;

                    if (count == K) { 
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
    }
}
