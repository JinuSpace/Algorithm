import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] paper = new boolean[101][101];


        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int bottom = Integer.parseInt(st.nextToken());

            for (int j = bottom; j < bottom + 10; j++) {
                for (int k = left; k < left + 10; k++) {
                    paper[j][k] = true;
                }
            }
        }
        int count = 0;

        for (int i = 0; i < paper.length; i++) {
            for (int j = 0; j < paper[0].length; j++) {
                if(paper[i][j]) {
                    count ++;
                }
            }
        }
        System.out.println(count);

    }
}
