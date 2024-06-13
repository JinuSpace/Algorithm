import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int max = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int temp = scanner.nextInt();

            if(temp < max){
                System.out.print(temp + " ");
            }
        }
    }
}