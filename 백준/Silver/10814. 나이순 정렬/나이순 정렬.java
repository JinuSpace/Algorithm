import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static class Member implements Comparable<Member> {
        int id;
        int age;
        String name;

        // Constructor
        public Member(int id, int age, String name) {
            this.id = id;
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Member member) {
            if (this.age != member.age) {
                return Integer.compare(this.age, member.age);
            }
            return Integer.compare(this.id, member.id);
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            members.add(new Member(i, Integer.parseInt(st.nextToken()), st.nextToken()));
        }
        Collections.sort(members);

        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }
}