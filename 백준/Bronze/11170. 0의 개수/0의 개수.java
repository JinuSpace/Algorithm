import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static int countZero(int number){
        int count = 0;
        while(number > 0){
            int temp = number%10;
            if(temp == 0){
                count ++;
            }
            number = number/10;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j <= end; j++) {
                if( j == 0){
                    count ++;
                }else{
                    count += countZero(j);
                }
            }
            System.out.println(count);
        }
    }
}