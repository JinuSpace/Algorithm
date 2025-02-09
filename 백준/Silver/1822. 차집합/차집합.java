import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int aSize = Integer.parseInt(st.nextToken());
        int bSize = Integer.parseInt(st.nextToken());

        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aSize; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bSize; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }

        TreeSet<Integer> result = new TreeSet<>();
        for (int num : aSet) {
            if (!bSet.contains(num)) {
                result.add(num);
            }
        }

        if (result.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(result.size());
            result.forEach(n -> System.out.print(n + " "));
        }
    }
}
