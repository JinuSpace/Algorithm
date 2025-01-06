import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] seats = new int[101];

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int seat = Integer.parseInt(st.nextToken());
            if(seats[seat] == 0) {
                seats[seat] = 1;
            }else{
                answer += 1;
            }
        }
        System.out.println(answer);

    }
}
