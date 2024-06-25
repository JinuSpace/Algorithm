import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
//1 SK
    // 2 CY
    // 3 SK
    // 4 CY
    // 5 SK
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if(num % 2 == 0){
            System.out.println("CY");
        }else {
            System.out.println("SK");
        }
    }
}