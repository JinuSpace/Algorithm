import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int multiplier = 10;

        while (N >= multiplier) {
            int remainder = N % multiplier;
            if (remainder >= multiplier / 2) {
                N = (N / multiplier) * multiplier + multiplier;
            } else {
                N = (N / multiplier) * multiplier; 
            }
            multiplier *= 10;
        }

        System.out.println(N);
    }
}