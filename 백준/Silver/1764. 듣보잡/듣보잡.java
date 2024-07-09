import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> cantListen = new HashSet<>();
        HashSet<String> cantSee = new HashSet<>();
        List<String> duplicates = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            cantListen.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            cantSee.add(br.readLine());
        }

        for(String value : cantListen){
            if(cantSee.contains(value)){
                duplicates.add(value);
            }
        }

        Collections.sort(duplicates);
        System.out.println(duplicates.size());
        for(String value : duplicates){
            System.out.println(value);
        }

    }
}