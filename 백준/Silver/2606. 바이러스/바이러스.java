import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> network = new ArrayList<>();
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int pairCount = Integer.parseInt(br.readLine());


        for (int i = 0; i <= n; i++) {
            network.add(new ArrayList<>());
        }

     
        for (int i = 0; i < pairCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            network.get(a).add(b);
            network.get(b).add(a);
        }

        visited = new boolean[n + 1];

        dfs(1);

        System.out.println(count);
    }

    public static void dfs(int current) {
        visited[current] = true;

        for (int next : network.get(current)) {
            if (!visited[next]) {
                count++;
                dfs(next);
            }
        }
    }
}
