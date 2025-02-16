import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        char[][] map = new char[y][x];

        for(int i = 0; i < y; i++) {
            String s = br.readLine();
            for(int j = 0; j < x; j++) {
                map[i][j] = s.charAt(j);
            }
        }
        int wood = 0;
        for(int i = 0; i < y; i++) {
            boolean isContinue = false;
            for(int j = 0; j < x; j++) {
                if(map[i][j] == '-') {
                    if(!isContinue) {
                        wood++;
                        isContinue = true;
                    }
                } else {
                    isContinue = false;
                }
            }
        }

        for(int i = 0; i < x; i++) {
            boolean isContinue = false;
            for(int j = 0; j < y; j++) {
                if(map[j][i] == '|') {
                    if(!isContinue) {
                        wood++;
                        isContinue = true;
                    }
                } else {
                    isContinue = false;
                }
            }
        }

        System.out.println(wood);
    }
}
