import java.io.*;
import java.util.*;

public class Main {

    public static int sumInteger(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                sum += Character.getNumericValue(input.charAt(i));
            }
        }
        return sum;
    }

    public static class Guitar implements Comparable<Guitar> {
        private final String serial;

        Guitar(String serial) {
            this.serial = serial;
        }

        public String getSerial() {
            return serial;
        }

        @Override
        public int compareTo(Guitar o) {
            if (this.serial.length() != o.serial.length()) {
                return this.serial.length() - o.serial.length();
            }

            int sumA = sumInteger(this.serial);
            int sumB = sumInteger(o.serial);
            if (sumA != sumB) {
                return sumA - sumB;
            }

            return this.serial.compareTo(o.serial);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Guitar> guitars = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String serial = br.readLine();
            guitars.add(new Guitar(serial));
        }

        Collections.sort(guitars);

        for (int i = 0; i < guitars.size(); i++) {
            System.out.println(guitars.get(i).getSerial());
        }
    }
}