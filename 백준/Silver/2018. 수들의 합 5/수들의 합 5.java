import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = i; j <= N; j++) {
                sum += j;
                if(sum == N){
                    sum = 0;
                    count ++;
                    break;
                }else if(sum > N){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}