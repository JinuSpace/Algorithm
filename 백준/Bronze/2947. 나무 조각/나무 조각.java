import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = 5;
        for (int i = 0; i < size; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < size - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;

                    for (int num : list) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            }

        } while (swapped);
    }
}