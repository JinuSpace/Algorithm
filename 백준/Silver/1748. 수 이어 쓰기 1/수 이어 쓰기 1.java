import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int jari = 0;
        int digit = 1;
        int start = 1;

        while (start <= N) {
            int end = Math.min(N, start * 10 - 1);
            jari += (end - start + 1) * digit;
            digit++;
            start *= 10; 
        }

        System.out.println(jari);
    }
}