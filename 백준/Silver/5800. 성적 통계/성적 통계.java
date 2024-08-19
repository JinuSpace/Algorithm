import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int classNum = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 1; i <= classNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int studentNum = Integer.parseInt(st.nextToken());
            ArrayList<Integer> studentScore = new ArrayList<>();
            for (int j = 0; j < studentNum; j++) {
                studentScore.add(Integer.parseInt(st.nextToken()));
            }
            map.put(i, studentScore);
        }

        for (int i = 1; i <= classNum; i++) {
            System.out.println("Class " + i);
            List<Integer> studentScore = map.get(i);
            Collections.sort(studentScore);
            int gap = Integer.MIN_VALUE;
            for (int j = 1; j < studentScore.size(); j++) {
                int currentGap = studentScore.get(j) - studentScore.get(j-1);
                if(gap < currentGap) {
                    gap = currentGap;
                }
            }
            System.out.println("Max " + studentScore.get(studentScore.size() - 1) + ", Min " + studentScore.get(0) + ", " + "Largest gap "+ gap);
        }


    }
}