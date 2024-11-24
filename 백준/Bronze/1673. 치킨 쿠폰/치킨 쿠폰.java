import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int sum = n; 
            int coupons = n;

            while (coupons >= k) {
                int newChicken = coupons / k;
                sum += newChicken;
                coupons = coupons % k + newChicken;
            }

            System.out.println(sum);
        }
    }
}