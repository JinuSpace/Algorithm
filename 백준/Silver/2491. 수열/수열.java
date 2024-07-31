import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxUp = 1;
        int maxDown = 1;
        int curUp = 1;
        int curDown = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                curUp++;
            } else {
                curUp = 1;
            }
            if (arr[i] <= arr[i - 1]) {
                curDown++;
            } else {
                curDown = 1;
            }
            maxUp = Math.max(maxUp, curUp);
            maxDown = Math.max(maxDown, curDown);
        }

        System.out.println(Math.max(maxUp, maxDown));
    }
}