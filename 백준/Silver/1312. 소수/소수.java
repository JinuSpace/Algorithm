import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);

        A = A % B;
        
        for (int i = 0; i < N - 1; i++) {
            A = (A * 10) % B;
        }

        System.out.println((A * 10) / B);
    }
}
