import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] square = new boolean[101][101];
        int count = 0;
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int leftX = Integer.parseInt(st.nextToken());
            int leftY = Integer.parseInt(st.nextToken());
            int rightX = Integer.parseInt(st.nextToken());
            int rightY = Integer.parseInt(st.nextToken());

            for (int y = leftY; y < rightY; y++) {
                for (int x = leftX; x < rightX; x++) {
                    square[y][x] = true;
                }
            }
        }
        for (int y = 1; y <= square.length-1; y++) {
            for (int x = 1; x <= square[0].length-1; x++) {
                if (square[y][x]) {
                    count ++;
                }
            }
        }

        System.out.println(count);
    }


}
