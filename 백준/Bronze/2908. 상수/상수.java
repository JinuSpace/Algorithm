import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int a = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));
        int b = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));
        
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}