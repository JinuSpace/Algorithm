import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int korean, english, math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student o) {
        if (this.korean != o.korean) return o.korean - this.korean;
        if (this.english != o.english) return this.english - o.english;
        if (this.math != o.math) return o.math - this.math;
        return this.name.compareTo(o.name);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
