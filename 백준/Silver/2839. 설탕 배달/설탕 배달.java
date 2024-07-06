import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static final int BIG = 5;
    static final int SMALL = 3;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        while(N > 0){
            if(N % BIG == 0){
                result += N/BIG;
                System.out.println(result);
                return;
            }
            if(N < 3){
                System.out.println(-1);
                return;
            }
            N -= 3;
            result ++;
        }
        System.out.println(result);
    }

}