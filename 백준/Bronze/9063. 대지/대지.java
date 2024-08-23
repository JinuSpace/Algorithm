import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        if(n == 1){
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x < minX){
                minX = x;
            }
            if (x > maxX) {
                maxX = x;
            }
            if(y < minY){
                minY = y;
            }
            if (y > maxY) {
                maxY = y;
            }
        }
        System.out.println((maxX - minX) * (maxY- minY));

    }
}