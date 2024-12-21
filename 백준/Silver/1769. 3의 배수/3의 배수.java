import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count = 0;

    public static int sumDigits(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0'; 
        }
        count++;
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine(); 
        while (s.length() > 1) { 
            int sum = sumDigits(s);
            s = String.valueOf(sum); 
        }

        System.out.println(count);
        if (Integer.parseInt(s) % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}