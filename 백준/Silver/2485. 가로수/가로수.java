import java.io.*;
import java.util.*;

public class Main {
    
    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }
        
        int[] gaps = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            gaps[i] = trees[i + 1] - trees[i];
        }
        
        int gcd = gaps[0];
        for (int i = 1; i < gaps.length; i++) {
            gcd = getGCD(gcd, gaps[i]);
        }
        
        int totalTrees = 0;
        for (int gap : gaps) {
            totalTrees += (gap / gcd) - 1;
        }
        
        System.out.println(totalTrees);
    }
    
    
}
