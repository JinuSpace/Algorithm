import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - i; j++) {
                int k = n - i - j; 

                if (k < j) break; 
                if (i + j > k) { 
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}