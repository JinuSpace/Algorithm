import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        String[] input = br.readLine().split(",");

        List<Integer> sequence = new ArrayList<>();
        for (String s : input) {
            sequence.add(Integer.parseInt(s));
        }

        for (int k = 0; k < K; k++) {
            List<Integer> nextSequence = new ArrayList<>();
            for (int i = 0; i < sequence.size() - 1; i++) {
                nextSequence.add(sequence.get(i + 1) - sequence.get(i));
            }
            sequence = nextSequence;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sequence.size(); i++) {
            sb.append(sequence.get(i));
            if (i < sequence.size() - 1) {
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
    }
}