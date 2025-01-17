import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        int count  = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            if(map.containsKey(key)) {
                int prev = map.get(key);
                if(prev != value) {
                    count ++;
                    map.put(key, value);
                }
            }else{
                map.put(key, value);
            }
        }
        System.out.println(count);
    }
}