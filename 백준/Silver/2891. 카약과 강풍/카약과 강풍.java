import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());


        boolean[] noKayaks = new boolean[N + 1];
        boolean[] moreKayaks = new boolean[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < S; i++) {
            noKayaks[Integer.parseInt(st.nextToken())] = true;
        }

        st = new StringTokenizer(br.readLine());


        for (int i = 0; i < R; i++) {
            moreKayaks[Integer.parseInt(st.nextToken())] = true;
        }

        for (int i = 1; i <= N; i++) {
            if(noKayaks[i] && moreKayaks[i]) {
                noKayaks[i] = false;
                moreKayaks[i] = false;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (noKayaks[i]) {
                if (i > 1 && moreKayaks[i - 1]) {
                    noKayaks[i] = false;
                    moreKayaks[i - 1] = false;
                } else if (i < N && moreKayaks[i + 1]) {
                    noKayaks[i] = false;
                    moreKayaks[i + 1] = false;
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (noKayaks[i]){
                count++;
            }
        }

        System.out.println(count);
    }
}