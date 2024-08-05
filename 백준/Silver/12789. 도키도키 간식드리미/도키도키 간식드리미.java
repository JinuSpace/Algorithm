import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int expected = 1;
        while (!queue.isEmpty()) {
            if (queue.peek() == expected) {
                queue.poll();
                expected++;
            } else if (!stack.isEmpty() && stack.peek() == expected) {
                stack.pop();
                expected++;
            } else {
                stack.push(queue.poll());
            }
        }

        while (!stack.isEmpty() && stack.peek() == expected) {
            stack.pop();
            expected++;
        }

        if (expected - 1 == n) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}