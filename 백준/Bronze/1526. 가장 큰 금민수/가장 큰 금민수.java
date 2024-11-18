import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static boolean isMinSoo(int N){
        while(N > 0){
            int one = N % 10;
            if(one != 4 && one != 7){
                return false;
            }
            N = N / 10;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = N; i >= 4; i--) {
            if(isMinSoo(i)){
                System.out.println(i);
                break;
            }
        }
    }
}