import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        
        if(n == 0){
            System.out.println(0);
        } else {
            int a = (int) Math.round(n * 0.15);
            
            for (int i = 0; i < n; i++) {
                list.add(Integer.valueOf(br.readLine()));
            }
            
            Collections.sort(list);
            
            int sum = 0;
            for (int i = a; i < n - a; i++) {
                sum += list.get(i);
            }

            System.out.println(Math.round((double)sum / (n - 2 * a)));
        }
    }
}