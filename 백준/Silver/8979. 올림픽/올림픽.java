import java.io.*;
import java.util.*;

public class Main {
    static class Country implements Comparable<Country> {
        int id, gold, silver, bronze;

        public Country(int id, int gold, int silver, int bronze) {
            this.id = id;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public int compareTo(Country o) {
            if (this.gold != o.gold) return o.gold - this.gold;
            if (this.silver != o.silver) return o.silver - this.silver;
            return o.bronze - this.bronze;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Country> countries = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            countries.add(new Country(id, gold, silver, bronze));
        }

        Collections.sort(countries);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < N; i++) {
            if (i > 0 && countries.get(i).compareTo(countries.get(i - 1)) != 0) {
                rank = i + 1;
            }
            rankMap.put(countries.get(i).id, rank);
        }

        System.out.println(rankMap.get(K));
    }
}
