import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] array = new int[26];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            array[input.charAt(i) - 'A'] ++;
        }
        int max = -1;
        char ch = '?';
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                ch = (char) ('A' + i);
            }else if (array[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}