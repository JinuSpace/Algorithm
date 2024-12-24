import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            sum = 0;
            for (int j = i; j < N; j++) {
                sum += numbers[j];
                if(sum > M){
                    break;
                }else if (sum == M){
                    count ++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
