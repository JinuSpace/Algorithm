import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumber = br.readLine();
        int[] count = new int[10];
        for (char c : roomNumber.toCharArray()) {
            int digit = c - '0';
            count[digit]++;
        }
        int sixAndNineCount = count[6] + count[9];
        count[6] = (sixAndNineCount + 1) / 2;
        count[9] = 0;
        int maxSets = 0;
        for (int c : count) {
            maxSets = Math.max(maxSets, c);
        }
        System.out.println(maxSets);
    }
}
