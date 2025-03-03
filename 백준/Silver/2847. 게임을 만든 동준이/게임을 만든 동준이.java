import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> scores = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            scores.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        
        for (int i = N - 2; i >= 0; i--) {
            if (scores.get(i) >= scores.get(i + 1)) {
                count += scores.get(i) - scores.get(i + 1) + 1;
                scores.set(i, scores.get(i + 1) - 1);
            }
        }

        System.out.println(count);
    }
}
