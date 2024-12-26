import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        List<Integer> xCuts = new ArrayList<>();
        List<Integer> yCuts = new ArrayList<>();
        xCuts.add(0); 
        yCuts.add(0); 

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            if (st.nextToken().equals("0")) {
                xCuts.add(Integer.parseInt(st.nextToken()));
            } else {
                yCuts.add(Integer.parseInt(st.nextToken()));
            }
        }
        xCuts.add(y); 
        yCuts.add(x); 

        Collections.sort(xCuts);
        Collections.sort(yCuts);

        int maxWidth = 0;
        for (int i = 1; i < xCuts.size(); i++) {
            maxWidth = Math.max(maxWidth, xCuts.get(i) - xCuts.get(i - 1));
        }

        int maxHeight = 0;
        for (int i = 1; i < yCuts.size(); i++) {
            maxHeight = Math.max(maxHeight, yCuts.get(i) - yCuts.get(i - 1));
        }

        System.out.println(maxWidth * maxHeight);
    }
}
