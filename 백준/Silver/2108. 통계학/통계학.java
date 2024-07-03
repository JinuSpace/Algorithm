import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Arrays.sort(numbers);

        for(int number: numbers){
            sum += number;
            if(number>max){
                max = number;
            }
            if(number<min){
                min = number;
            }
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        int maxFrequency = Collections.max(map.values());

        ArrayList<Integer> mostFrequentValues = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mostFrequentValues.add(entry.getKey());
            }
        }

        double avg = Math.round((double) sum / n);
        int middle = numbers[n / 2];
        int mode = 0;

        if (mostFrequentValues.size() == 1) {
            mode = mostFrequentValues.get(0);
        } else {
            Collections.sort(mostFrequentValues);
            mode = mostFrequentValues.get(1);
        }

        int range = numbers[n - 1] - numbers[0];

        System.out.printf("%.0f\n",avg);
        System.out.println(middle);
        System.out.println(mode);
        System.out.println(range);
    }
}