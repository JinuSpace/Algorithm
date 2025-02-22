import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] studentIds = new String[N];

        for (int i = 0; i < N; i++) {
            studentIds[i] = br.readLine();
        }
        
        int idLength = studentIds[0].length();
        int k = 1;
        
        while (true) {
            Set<String> uniqueIds = new HashSet<>();
            boolean isUnique = true;

            for (String id : studentIds) {
                String suffix = id.substring(idLength - k);
                if (!uniqueIds.add(suffix)) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                System.out.println(k);
                break;
            }
            k++;
        }
    }
}
