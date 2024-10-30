import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        BigInteger n = new BigInteger(input[0]);
        BigInteger m = new BigInteger(input[1]);

        BigInteger quotient = n.divide(m); 
        BigInteger remainder = n.remainder(m); 

        System.out.println(quotient);
        System.out.println(remainder);
    }
}
