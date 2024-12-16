import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            System.out.println(combination(M, N));
        }
    }

    public static BigInteger combination(int n, int r) {
        BigInteger boonJa = BigInteger.ONE;
        BigInteger boonMo = BigInteger.ONE;


        for (int i = 0; i < r; i++) {
            boonJa = boonJa.multiply(BigInteger.valueOf(n - i));
            boonMo = boonMo.multiply(BigInteger.valueOf(i + 1));
        }

        return boonJa.divide(boonMo);
    }
}
