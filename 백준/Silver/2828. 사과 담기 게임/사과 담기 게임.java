import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int J = Integer.parseInt(br.readLine());
        
        int left = 1;
        int right = M;
        int moveDistance = 0;
        
        for (int i = 0; i < J; i++) {
            int applePosition = Integer.parseInt(br.readLine());
            
            if (applePosition < left) {
                moveDistance += (left - applePosition);
                right -= (left - applePosition);
                left = applePosition;
            } else if (applePosition > right) {
                moveDistance += (applePosition - right);
                left += (applePosition - right);
                right = applePosition;
            }
        }
        
        System.out.println(moveDistance);
    }
}