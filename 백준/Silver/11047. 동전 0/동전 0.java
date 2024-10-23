import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> coins = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int coinCount = 0;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            coins.add(Integer.parseInt(br.readLine()));
        }
        coins.sort(Collections.reverseOrder());

        while(K  != 0){
            for (int i = 0; i < coins.size(); i++) {
                if(K / coins.get(i) > 0){
                    int curCoinCount;
                    curCoinCount = K / coins.get(i);
                    coinCount+= curCoinCount;
                    K -= coins.get(i) * curCoinCount;
                }
            }
        }
        System.out.println(coinCount);
    }
}