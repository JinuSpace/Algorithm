import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String findString = br.readLine();
        int count = 0;
        while(s.indexOf(findString) != -1) {
            count ++;
            s = s.substring(s.indexOf(findString) + findString.length());
        }

        System.out.println(count);
    }

}