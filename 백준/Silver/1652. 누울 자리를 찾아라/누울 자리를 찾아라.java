import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[][] room = new char[N][N];

        for (int i = 0; i < N; i++) {
            room[i] = br.readLine().toCharArray();
        }

        int garo = 0;
        int sero = 0;

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (room[i][j] == '.') {
                    count++;
                } else {
                    if (count >= 2) {
                        garo++;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {
                garo++;
            }
        }

        for (int j = 0; j < N; j++) {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (room[i][j] == '.') {
                    count++;
                } else {
                    if (count >= 2) {
                        sero++;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {
                sero++;
            }
        }
        StringBuilder sb = new StringBuilder();

        sb.append(garo);
        sb.append(" ");
        sb.append(sero);

        System.out.println(sb);

    }
}