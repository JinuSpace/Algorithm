import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int candidate = 1;

        while (true) {
            int count = 0;

            for (int num : numbers) {
                if (candidate % num == 0) {
                    count++;
                }
            }

            if (count >= 3) {
                System.out.println(candidate);
                break;
            }

            candidate++;
        }
    }
}
