import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int length = s.length();
        int start = 0;

        while (start < length) {
            int end = Math.min(start + 10, length);
            System.out.println(s.substring(start, end));
            start += 10;
        }

    }
}