import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int year;
    int month;
    int day;

    Student(String[] input){
        this.name = input[0];
        day = Integer.parseInt(input[1]);
        month = Integer.parseInt(input[2]);
        year = Integer.parseInt(input[3]);
    }

    @Override
    public int compareTo(Student other) {
        if (this.year == other.year) {
            if (this.month == other.month) {
                return Integer.compare(this.day, other.day);
            }

            return Integer.compare(this.month, other.month);
        }

        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return name;
    }
}
public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            list.add(new Student(input));
        }
        Collections.sort(list);

        System.out.println(list.get(n - 1));
        System.out.println(list.get(0));
    }
}