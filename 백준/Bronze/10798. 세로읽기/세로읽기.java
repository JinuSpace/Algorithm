import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static char[][] chars = new char[5][15]; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    
        for (int i = 0; i < 5; i++) {
            String line = br.readLine(); 
            for (int j = 0; j < line.length(); j++) {
                chars[i][j] = line.charAt(j); 
            }
        }


        StringBuilder result = new StringBuilder();
        for (int j = 0; j < 15; j++) { 
            for (int i = 0; i < 5; i++) { 
                if (chars[i][j] != '\0') { 
                    result.append(chars[i][j]);
                }
            }
        }

        System.out.println(result.toString());
    }
}