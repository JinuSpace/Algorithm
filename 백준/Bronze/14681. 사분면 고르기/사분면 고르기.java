import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        int a = Integer.parseInt(input1);
        input1 = br.readLine();
        int b = Integer.parseInt(input1);

        if(a >0 && b >0){
            System.out.println(1);
        }else if(a > 0 && b < 0){
            System.out.println(4);
        } else if (a< 0 && b > 0) {
            System.out.println(2);
        }else{
            System.out.println(3);
        }


    }
}