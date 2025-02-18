import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); 
        int[] sumPairs = new int[N]; 
        
        for (int i = 0; i < N; i++) {
            sumPairs[i] = Integer.parseInt(br.readLine());
        }
        
        int totalSum = 0; 
        for (int num : sumPairs) {
            totalSum += num;
        }
        totalSum /= 2;
        
        int firstCandy = totalSum; 
        for (int i = 1; i < N; i += 2) { 
            firstCandy -= sumPairs[i];
        }

        int[] candies = new int[N]; 
        candies[0] = firstCandy; 

        for (int i = 1; i < N; i++) { 
            candies[i] = sumPairs[i - 1] - candies[i - 1];
        }

        StringBuilder sb = new StringBuilder();
        for (int candy : candies) {
            sb.append(candy).append("\n"); 
        }
        System.out.print(sb); 
    }
}
