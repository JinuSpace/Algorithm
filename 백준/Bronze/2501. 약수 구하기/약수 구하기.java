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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int count = 0;
        int answer = 0;
        for (int i = 1; i <= a; i++) {
            if(a % i == 0){
                count ++;
            }
            if(b == count){
                answer = i;
                break;
            }
        }
        System.out.println(answer);

    }
}