import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        
        // StringTokenizer를 사용해 모든 값을 리스트에 추가
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        String answer = "mixed";
        
        if (list.get(0) == 1) {
            boolean isAscending = true;
            for (int i = 1; i < 8; i++) {
                if (list.get(i) != i + 1) {
                    isAscending = false;
                    break;
                }
            }
            if (isAscending) {
                answer = "ascending";
            }
        }
        else if (list.get(0) == 8) {
            boolean isDescending = true;
            for (int i = 1; i < 8; i++) {
                if (list.get(i) != 8 - i) {
                    isDescending = false;
                    break;
                }
            }
            if (isDescending) {
                answer = "descending";
            }
        }
        
        System.out.println(answer);
    }
}