import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] sizes = new int[6];
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());


        int sum = 0;

        for (int i = 0; i < 6; i++) {
            if(sizes[i]%T==0){
                sum += sizes[i]/T;
            }else{
                sum += sizes[i]/T+1;
            }
        }
        System.out.println(sum);
        System.out.println(N/P + " " + N%P);
    }
}