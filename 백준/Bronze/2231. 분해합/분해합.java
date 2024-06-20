import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int max = 10000000;

        for (int i = 1; i < max; i++) {
            int tmp = i;
            int sum = 0;

            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            if (input == i + sum) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
