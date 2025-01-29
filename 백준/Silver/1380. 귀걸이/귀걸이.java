import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int senario = 0;
        while(true){
            senario ++;
            int N = Integer.parseInt(br.readLine());
            if( N == 0){
                break;
            }
            String[] names = new String[N +1];
            Map<String, Integer> girls = new HashMap<>();
            for (int i = 1; i <= N; i++) {
                names[i] = br.readLine();
                girls.put(names[i], 0);
            }

            for (int i = 0; i < 2 * N -1; i++) {
                String[] s = br.readLine().split(" ");
                int girlIdx = Integer.parseInt(s[0]);
                String name = names[girlIdx];
                girls.put(name, girls.get(name) + 1);
            }

            for(Map.Entry<String, Integer> entry : girls.entrySet()){
                if(entry.getValue() % 2 == 1){
                    System.out.println(senario + " " + entry.getKey());
                }
            }
        }
    }
}
