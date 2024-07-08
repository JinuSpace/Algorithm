import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        System.out.print("<");
        int count = 0;
        while (!queue.isEmpty()) {
            count ++;
            if(count % K == 0){
                if(queue.size() != 1){
                    System.out.print(queue.poll() + ", ");
                }else{
                    System.out.print(queue.poll());
                }
            }else{
                queue.add(queue.remove());
            }
        }
        System.out.println(">");

    }
}