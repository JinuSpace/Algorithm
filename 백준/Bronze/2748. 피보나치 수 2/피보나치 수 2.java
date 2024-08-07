import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static long fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        long [] fibonacci = new long[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2 ; i <= n ; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        return fibonacci[n];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        long result = fibonacci(n);

        System.out.println(result);

    }
}