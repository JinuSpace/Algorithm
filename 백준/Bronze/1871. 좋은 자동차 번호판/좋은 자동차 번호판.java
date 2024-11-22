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

        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(),"-");
            int firstValue = 0;
            int secondValue = 0;
            
            String first = st.nextToken();
            secondValue = Integer.parseInt(st.nextToken());

            for (int j = 0; j <first.length(); j++) {
                firstValue += (first.charAt(j) - 'A') * Math.pow(26, 2-j);

            }

            int answer = 0;
            if(firstValue >= secondValue){
                answer = firstValue - secondValue;
            }else{
                answer = secondValue - firstValue;
            }

            if(answer > 100){
                System.out.println("not nice");
            }else{
                System.out.println("nice");
            }
        }


    }
}
