import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 100 && scanner.hasNextLine(); i++) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
}