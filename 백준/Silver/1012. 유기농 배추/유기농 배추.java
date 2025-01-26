import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int M,N;

    static boolean[][] bat;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void dfs(int y, int x){
        visited[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if(ny >= 0 && ny < N && nx >= 0 && nx < M){
                if(!visited[ny][nx] && bat[ny][nx]){
                    dfs(ny,nx);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T  = Integer.parseInt(br.readLine());





        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            bat = new boolean[N][M];
            visited = new boolean[N][M];
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                bat[x][y] = true;
            }

            int worms = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(bat[i][j] && !visited[i][j]){
                        dfs(i,j);
                        worms ++;
                    }
                }
            }
            System.out.println(worms);
        }

    }
}