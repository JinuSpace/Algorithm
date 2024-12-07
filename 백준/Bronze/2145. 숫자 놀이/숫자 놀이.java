import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int sumCal(int number){
        int sum = 0;
        while (number > 0){
            int temp = number % 10;
            sum += temp;          
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break;
            }

            while (N >= 10) {
                N = sumCal(N);
            }
            System.out.println(N);
        }
    }
}