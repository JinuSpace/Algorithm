import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] sum = new int[11]; 
        sum[0] = 0; 

   
        for (int i = 1; i <= 10; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(br.readLine());
        }

        int closest = 0; 

        for (int i = 1; i <= 10; i++) {
            if (Math.abs(100 - sum[i]) < Math.abs(100 - closest)) {
                closest = sum[i];
            } else if (Math.abs(100 - sum[i]) == Math.abs(100 - closest)) {
                closest = Math.max(closest, sum[i]);
            }
        }

        System.out.println(closest);
    }
}