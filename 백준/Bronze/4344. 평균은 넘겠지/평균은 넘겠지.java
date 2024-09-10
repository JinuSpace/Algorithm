import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            double avg = 0;
            int N = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                int score = Integer.parseInt(st.nextToken());
                list.add(score);
                sum += score;
            }
            int count = 0;

            avg = (double) sum / N;

            for (int score : list){
                if(score > avg){
                    count ++;
                }
            }
            System.out.printf("%.3f%%\n", (double) count / N * 100);

        }
    }
}