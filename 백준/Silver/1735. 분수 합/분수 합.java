import java.io.*;
import java.util.*;

public class Main {

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] BoonJas = new int[2];
        int[] BoonMos = new int[2];
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BoonJas[i] = Integer.parseInt(st.nextToken());
            BoonMos[i] = Integer.parseInt(st.nextToken());
        }

        int tongBoon = BoonMos[0] * BoonMos[1];

        for (int i = 0; i < 2; i++) {
            BoonJas[i] *= tongBoon /BoonMos[i];
            BoonMos[i] = tongBoon;
        }

        int resultBoonJa = BoonJas[0] + BoonJas[1];
        int resultBoonMo = tongBoon;

        int gcd = gcd(resultBoonJa, resultBoonMo);
        resultBoonJa /= gcd;
        resultBoonMo /= gcd;

        System.out.println(resultBoonJa + " " + resultBoonMo);

    }
}