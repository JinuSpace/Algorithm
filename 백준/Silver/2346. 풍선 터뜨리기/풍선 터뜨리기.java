import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<int[]> balloons = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            balloons.add(new int[]{i + 1, Integer.parseInt(st.nextToken())});
        }

        StringBuilder result = new StringBuilder();
        int currentIdx = 0;

        while (!balloons.isEmpty()) {
            int[] current = balloons.remove(currentIdx);
            result.append(current[0]).append(" ");

            if (balloons.isEmpty()){
                break;
            }

            int move = current[1];
            if (move > 0) {
                currentIdx = (currentIdx + (move - 1)) % balloons.size();
            } else {
                currentIdx = (currentIdx + move) % balloons.size();
                if (currentIdx < 0){
                    currentIdx += balloons.size();
                }
            }
        }

        System.out.println(result.toString().trim());
    }
}