import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int start = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) {
                max = Math.max(max, arr[i] - start);
            } else {
                start = arr[i];
            }
        }

        System.out.println(max);
    }
}
