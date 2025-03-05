import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        
        int n = 1, sum = 1;
        while (sum < X) {
            n++;
            sum += n;
        }
        
        int offset = sum - X;
        int numerator, denominator;
        
        if (n % 2 == 0) {
            numerator = n - offset;
            denominator = 1 + offset;
        } else {
            numerator = 1 + offset;
            denominator = n - offset;
        }
        
        System.out.println(numerator + "/" + denominator);
    }
}
