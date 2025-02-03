import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String target = "UCPC";
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target.charAt(index)) {
                index++;
            }
            if (index == target.length()) {
                System.out.println("I love UCPC");
                return;
            }
        }

        System.out.println("I hate UCPC");
    }
}
