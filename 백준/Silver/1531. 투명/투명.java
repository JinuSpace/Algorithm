import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] art = new int[100][100];
        for (int i = 0; i < art.length; i++) {
            Arrays.fill(art[i], 0);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken())-1;
            int startY = Integer.parseInt(st.nextToken())-1;
            int endX = Integer.parseInt(st.nextToken())-1;
            int endY = Integer.parseInt(st.nextToken())-1;

            for (int y = startY; y <= endY; y++) {
                for (int x = startX; x <= endX; x++) {
                    art[y][x] = art[y][x] + 1;
                }
            }

        }
        int count =0;
        for (int y = 0; y < 100; y++) {
            for (int x = 0; x < 100; x++) {
                if (art[y][x] > M) {
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}