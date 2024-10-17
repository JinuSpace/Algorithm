import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static class Point implements Comparable<Point> {
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        private int x;
        private int y;

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return this.y - o.y;
            }else {
                return this.x - o.x;
            }
        }
        @Override
        public String toString() {
            return this.x + " " + this.y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Point> points = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point(x, y));
        }

        Collections.sort(points);

        StringBuilder sb = new StringBuilder();
        for (Point point : points) {
            sb.append(point).append("\n");
        }

        System.out.print(sb);
    }
}