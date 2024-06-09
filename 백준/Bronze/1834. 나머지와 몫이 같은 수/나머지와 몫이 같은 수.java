import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        long num = Long.parseLong(input);
        long sum = 0L;
        for (long i = 1; i < num; i++) {
            sum += (num * i) + i;
        }
        System.out.println(sum);
    }
}