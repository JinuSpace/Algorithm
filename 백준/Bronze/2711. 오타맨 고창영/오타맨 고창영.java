import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int incorrectIdx = Integer.parseInt(st.nextToken())-1;
            String s = st.nextToken();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if(j != incorrectIdx) {
                    sb.append(s.charAt(j));
                }
            }

            System.out.println(sb);
        }
    }
}