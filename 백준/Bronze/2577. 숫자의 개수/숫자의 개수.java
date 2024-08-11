import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[] count = new int[10];
        String s = Integer.toString(a * b * c);
        for (int i = 0; i < s.length(); i++) {
            count[Character.getNumericValue(s.charAt(i))]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}