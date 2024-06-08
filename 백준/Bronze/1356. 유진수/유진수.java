import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static boolean isInputEugine(String s){
        int length = s.length();

        for(int i = 1; i < length; i++){
            String front = s.substring(0, i);
            String back = s.substring(i);

            int frontValue = calculate(front);
            int backValue = calculate(back);

            if(frontValue == backValue){
                return true;
            }
        }
        return false;
    }

    public static int calculate(String s){
        int value = 1;
        for(char c : s.toCharArray()){
            value *= Character.getNumericValue(c);
        }

        return value;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        if(isInputEugine(input)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}