import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int a = Integer.parseInt(br.readLine());
            if(a == -1){
                break;
            }
            int sum = 0;
            List<Integer> arr = new ArrayList<>();
            for (int i = 1; i < a; i++) {
                if(a % i == 0){
                    arr.add(i);
                    sum += i;
                }
            }
            if(sum == a){
                System.out.print(a + " = ");
                String answer = arr.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(" + "));
                System.out.println(answer);
            }else{
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}