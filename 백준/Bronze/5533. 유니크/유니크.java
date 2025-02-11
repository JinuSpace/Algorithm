import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] numbers = new int[N][3];
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int round = 0; round < 3; round++) {
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int i = 0; i < N; i++) {
                int num = numbers[i][round];
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            for (int i = 0; i < N; i++) {
                int num = numbers[i][round];
                if (countMap.get(num) == 1) {
                    scores[i] += num;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int score : scores) {
            sb.append(score).append("\n");
        }
        System.out.print(sb);
    }
}
