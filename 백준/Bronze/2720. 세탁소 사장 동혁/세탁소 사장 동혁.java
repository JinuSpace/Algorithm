import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class Main {
    static final int QUATER = 25;
    static final int DIME = 10;
    static final int NICKEL = 5;
    static final int PENNY = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        Scanner scanner = new Scanner(System.in);
        int  n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            int a = input / QUATER;
            input = input % QUATER;
            int b = (input%QUATER) / DIME;
            input = input % DIME;
            int c = (input%DIME ) / NICKEL;
            input = input % NICKEL;
            int d =  input;

            System.out.println(a + " " + b + " " + c + " " + d);
        }
    }
}