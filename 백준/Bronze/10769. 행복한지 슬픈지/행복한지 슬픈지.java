import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String happy = ":-)";
        String sad = ":-(";

        String s = br.readLine();
        int happyCount = 0;
        int sadCount = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            String emoticon = s.substring(i, i + 3);
            if (emoticon.equals(happy)) {
                happyCount++;
            } else if (emoticon.equals(sad)) {
                sadCount++;
            }
        }

        if (happyCount == 0 && sadCount == 0) {
            System.out.println("none");
        } else if (happyCount > sadCount) {
            System.out.println("happy");
        } else if (sadCount > happyCount) {
            System.out.println("sad");
        } else {
            System.out.println("unsure");
        }
    }
}