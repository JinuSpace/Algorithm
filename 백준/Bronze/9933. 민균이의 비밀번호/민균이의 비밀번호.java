import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        String passwd = "";
        for (int i = 0; i < N; i++) {
            StringBuffer sb = new StringBuffer(br.readLine());
            String s = sb.toString();
            set.add(s);
            if(set.contains(sb.reverse().toString())) {
                passwd = s;
                break;
            }

        }
        int mid = passwd.length() / 2;
        System.out.println(passwd.length() + " " + passwd.charAt(mid));
    }
}
