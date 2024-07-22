import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        String bestSeller = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String book = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount || (count == maxCount && book.compareTo(bestSeller) < 0)) {
                bestSeller = book;
                maxCount = count;
            }
        }

        System.out.println(bestSeller);
    }
}