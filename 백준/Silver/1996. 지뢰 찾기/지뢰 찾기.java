import java.io.*;

public class Main {
    static int N;
    static char[][] map;
    static int[][] result;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    
    private static void computeMineMap() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Character.isDigit(map[i][j])) {
                    int mines = map[i][j] - '0';
                    result[i][j] = -1; 
                    for (int d = 0; d < 8; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];
                        if (isValid(ni, nj) && result[ni][nj] != -1) {
                            result[ni][nj] += mines;
                        }
                    }
                }
            }
        }
    }
    
    private static boolean isValid(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }
    
    private static void printResult() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (result[i][j] == -1) {
                    sb.append('*');
                } else if (result[i][j] >= 10) {
                    sb.append('M');
                } else {
                    sb.append(result[i][j]);
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        result = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
                if (Character.isDigit(map[i][j])) {
                    result[i][j] = -1; 
                }
            }
        }
        
        computeMineMap();
        printResult();
    }
    
    
    
    
}
