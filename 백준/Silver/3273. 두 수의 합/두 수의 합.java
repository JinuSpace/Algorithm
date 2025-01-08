import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int x = Integer.parseInt(br.readLine());

        Collections.sort(list);
        int count = 0;

        int left = 0;
        int right = n -1;

        while(left < right) {
            int sum = list.get(left) + list.get(right);

            if(sum == x){
                count ++;
                left ++;
                right --;
            }else if(sum < x){
                left ++;
            }else{
                right --;
            }
        }
        System.out.println(count);
    }
}
