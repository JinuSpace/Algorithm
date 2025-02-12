import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            Map<Long, Integer> armys = new HashMap<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());

            for (int i = 0; i < T; i++) {
                Long army = Long.parseLong(st.nextToken());
                armys.put(army, armys.getOrDefault(army, 0) + 1);
            }

            int max = Integer.MIN_VALUE;
            Long conquered = 0L;
            for(Map.Entry<Long, Integer> entry : armys.entrySet()) {
                if(entry.getValue() > max) {
                    max = entry.getValue();
                    conquered = entry.getKey();
                }
            }

            if(T/2 < max) {
                System.out.println(conquered);
            }else{
                System.out.println("SYJKGW");
            }
        }




    }
}