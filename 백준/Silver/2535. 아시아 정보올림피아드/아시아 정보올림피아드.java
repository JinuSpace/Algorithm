import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Student implements Comparable<Student> {
        int country;
        int number;
        int score;
        public Student(int country, int number, int score) {
            this.country = country;
            this.number = number;
            this.score = score;
        }

        @Override
        public int compareTo(Student o) {
            return o.score - this.score;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Student> students = new ArrayList<>();
        Map<Integer, Integer> win = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int country = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());

            students.add(new Student(country, number, score));
        }

        Collections.sort(students);
        List<Student> winners = new ArrayList<>();

        for(Student student : students) {
            if(win.get(student.country) != null && win.get(student.country) >= 2) {
                continue;
            }
            win.put(student.country, win.getOrDefault(student.country, 0) + 1);
            winners.add(student);

            if(winners.size() == 3){
                break;
            }
        }

        for (int i = 0; i < winners.size(); i++) {
            Student winner = winners.get(i);
            System.out.println(winner.country + " " + winner.number);
        }
    }
}