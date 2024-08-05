import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.equals("ENTER")){
                sum += set.size();
                set.clear();
            }else if(i == n-1){
                set.add(s);
                sum += set.size();
            }
            else{
                set.add(s);
            }
        }
        System.out.println(sum);

    }
}