import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int coin = 0;
        while (n > 0) {
            if (n % 5 == 0) {
                coin += n / 5;
                n = 0;
                break;
            } else {
                n -= 2;
                coin++;
            }
        }
        if (n < 0) {
            System.out.println(-1);
        } else {
            System.out.println(coin);
        }
    }
}