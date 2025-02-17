import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for (int i = 0; i < N; i++) {
            temp = 0;
            for (int j = 1; j < 5; j++) {
                if(!list.contains(list.get(i) +j)){
                    temp ++;
                }
            }
            min = Math.min(min, temp);
        }
        System.out.println(min);
    }
}
