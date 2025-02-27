import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int copy = N;
        int count = 0;

        while(true){
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            count++;

            if(copy == N){
                break;
            }
        }
        System.out.println(count);
    }
}