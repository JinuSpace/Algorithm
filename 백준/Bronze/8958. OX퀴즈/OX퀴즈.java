import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            int score = 1;
            int sum = 0;
            if(input.charAt(0) == 'O'){
                sum += score;
            }
            for (int j = 1; j < input.length(); j++) {
                if(input.charAt(j-1) == 'O'){
                    score ++;
                }
                if(input.charAt(j) == 'O'){
                    sum += score;
                }else{
                    score =1;
                }
            }
            System.out.println(sum);
        }

    }
}