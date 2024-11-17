import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        long sum = 0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                int digitA = A.charAt(i) - '0';
                int digitB = B.charAt(j) - '0';
                sum += (long) digitA * digitB;
            }
        }
        System.out.println(sum);
    }
}