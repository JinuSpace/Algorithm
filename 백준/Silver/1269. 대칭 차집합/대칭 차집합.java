import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        HashSet<Integer> A = new HashSet<>();
        for (int i = 0; i < n; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        HashSet<Integer> B = new HashSet<>();
        for (int i = 0; i < m; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> onlyA = new HashSet<>(A);
        onlyA.removeAll(B);

        Set<Integer> onlyB = new HashSet<>(B);
        onlyB.removeAll(A);

        System.out.println(onlyA.size() + onlyB.size());
    }
}