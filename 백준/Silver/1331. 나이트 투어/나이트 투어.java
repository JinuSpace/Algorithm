import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] visited = new boolean[6][6];
        List<int[]> moves = new ArrayList<>();
        boolean isValid = true;

        int startX = -1, startY = -1;

        for (int i = 0; i < 36; i++) {
            String input = br.readLine();
            int visitX = input.charAt(0) - 'A';
            int visitY = input.charAt(1) - '1';

            if (visited[visitY][visitX]) {
                isValid = false;
                break;
            }

            visited[visitY][visitX] = true;
            moves.add(new int[]{visitX, visitY});

            if (i == 0) {
                startX = visitX;
                startY = visitY;
            }
        }

        for (int i = 0; i < moves.size() - 1; i++) {
            int[] cur = moves.get(i);
            int[] next = moves.get(i + 1);
            if (!isKnightMove(cur[0], cur[1], next[0], next[1])) {
                isValid = false;
                break;
            }
        }

        int[] last = moves.get(moves.size() - 1);
        if (!isKnightMove(last[0], last[1], startX, startY)) {
            isValid = false;
        }

        if(isValid){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }

    private static boolean isKnightMove(int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
