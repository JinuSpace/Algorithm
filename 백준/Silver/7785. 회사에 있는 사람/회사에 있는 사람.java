import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String action = input[1];
            if(action.equals("enter")) {
                set.add(name);
            } else if(action.equals("leave")) {
                set.remove(name);
            }
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        for (String s : list) {
            System.out.println(s);
        }
    }
}