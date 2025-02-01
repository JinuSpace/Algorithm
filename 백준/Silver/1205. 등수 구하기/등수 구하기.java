import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(st.nextToken());
        int newPoint = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int[] points = new int[P];
        if(N>0) {
            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < N; i++){
                points[i] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(points);

        if(P==N && points[0]>= newPoint){
            System.out.println(-1);
            return;
        }

        int rank = 1;
        for(int i=P-1;i>=Math.max(0,P-N-1);i--){
            if(points[i]> newPoint){
                rank++;
            }
            else{
                break;
            }
        }
        System.out.println(rank);
    }
}