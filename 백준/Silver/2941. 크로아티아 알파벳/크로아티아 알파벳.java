import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();        
        String[] alpha = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int index = 0;

		for (int i = 0; i < alpha.length; i++) {		
            index = s.indexOf(alpha[i]);            
			if (index >= 0) { 
				s = s.replaceAll(alpha[i], "1");
			}
		}
		System.out.println(s.length());
	}
}