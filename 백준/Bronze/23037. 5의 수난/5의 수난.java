import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (long) Math.pow(Character.getNumericValue(s.charAt(i)), 5);
        }

        System.out.println(sum);
    }
}