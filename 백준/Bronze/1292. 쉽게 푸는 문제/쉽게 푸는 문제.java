import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int[] nums = new int[1000];
		
		int cnt = 0;
		int num = 1;
		
		for(int i = 0 ; i < 1000 ; i++) {
			nums[i] = num;
			cnt++;
			
			if(num == cnt) {
				num++;
				cnt = 0;
			}
		}
		
		int sum = 0;
		
		for(int i = a ; i <= b ; i++) {
			sum += nums[i-1];
		}
		
		System.out.println(sum);
	}
}