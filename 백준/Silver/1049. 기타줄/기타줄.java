import java.io.*;
import java.util.*;

public class Main {
    static final int PACKSIZE = 6;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<Integer> packCosts = new ArrayList<>();
        List<Integer> eachCosts = new ArrayList<>();

        while(M -- > 0){
            st = new StringTokenizer(br.readLine());
            packCosts.add(Integer.parseInt(st.nextToken()));
            eachCosts.add(Integer.parseInt(st.nextToken()));
        }

        int packMin = Collections.min(packCosts);
        int eachMin = Collections.min(eachCosts);
        int a = (N / PACKSIZE + 1) * packMin;
        int b = N / PACKSIZE * packMin + N % PACKSIZE * eachMin;
        int c = N * eachMin;
        System.out.println(Math.min(a, Math.min(b, c)));
    }
}
