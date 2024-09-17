import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static int[] house;

    public static int canInstall(int distance) {

        int count = 1;
        int lastLocate = house[0];

        for(int i = 1; i < house.length; i++) {
            int locate = house[i];

            if(locate - lastLocate >= distance) {
                count++;
                lastLocate = locate;
            }
        }
        return count;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        house = new int[N];

        for (int i = 0; i < N; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(house);

        int start = 1;
        int end = house[N -1] - house[0] + 1;

        while(start < end) {
            int mid = (end + start) / 2;

            if(canInstall(mid) < C) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println(start - 1);
    }
}