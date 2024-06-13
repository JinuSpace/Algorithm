import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();
        int time = scanner .nextInt();

        second += time;

        if (second >= 60) {
            minute += second / 60;
            second = second % 60;
        }


        if (minute >= 60) {
            hour += minute / 60;
            minute = minute % 60;
        }


        if (hour >= 24) {
            hour = hour % 24;
        }

        System.out.println(hour + " " + minute + " " + second);
    }
}