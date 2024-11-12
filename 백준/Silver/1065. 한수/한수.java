import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = hansoo(N);
        System.out.println(count);

    }

    public static int hansoo(int num) {
        int count = 0;

        if (num < 100) {
            return num;
        } else {
            count = 99;
            for (int i = 100; i <= num; i++) {
                int back = i / 100;
                int sip = (i / 10) % 10;
                int one = i % 10;

                if ((back - sip) == (sip - one)) {
                    count++;
                }
            }
        }
        return count;
    }

}