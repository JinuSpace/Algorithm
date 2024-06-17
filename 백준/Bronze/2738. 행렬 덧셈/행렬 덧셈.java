import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int [][] a = new int[y][x];

        for(int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < x; j++) {
                a[i][j] += Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < x; j++) {
                a[i][j] += Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}