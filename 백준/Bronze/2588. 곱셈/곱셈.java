import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int ten = 1;
        int sum = 0;
        while(b >0){
            int i = b%10;
            int temp = a * i;
            System.out.println(temp);
            sum += temp * ten;
            b /= 10;
            ten *= 10;
        }
        System.out.println(sum);
    }
}