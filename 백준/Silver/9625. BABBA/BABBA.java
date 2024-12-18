import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        int countA = 1; 
        int countB = 0; 

        for (int i = 0; i < N; i++) {
            int newCountA = countB;
            int newCountB = countA + countB;

            countA = newCountA;
            countB = newCountB;
        }

        System.out.println(countA + " " + countB);
    }
}
