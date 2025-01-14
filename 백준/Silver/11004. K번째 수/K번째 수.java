import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);

        List<Integer> list = new ArrayList<>();

        String[] numbers = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(numbers[i]));
        }

        Collections.sort(list);

        System.out.println(list.get(K -1));
    }
}
