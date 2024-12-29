import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String vowels = "aeiou";

        while (true) {
            String passwd = br.readLine();
            if (passwd.equals("end")) {
                break;
            }

            boolean hasVowel = false;
            int vowelCount = 0, consonantCount = 0;
            boolean isValid = true;
            char prevChar = 0;

            for (int i = 0; i < passwd.length(); i++) {
                char ch = passwd.charAt(i);
                boolean isVowel = vowels.indexOf(ch) >= 0;

                if (isVowel) {
                    hasVowel = true;
                    vowelCount++;
                    consonantCount = 0;
                } else {
                    consonantCount++;
                    vowelCount = 0;
                }

                if (vowelCount == 3 || consonantCount == 3) {
                    isValid = false;
                    break;
                }

                if (i > 0 && ch == prevChar && ch != 'e' && ch != 'o') {
                    isValid = false;
                    break;
                }

                prevChar = ch;
            }

            if (!hasVowel) {
                isValid = false;
            }

            StringBuilder sb = new StringBuilder();
            sb.append("<").append(passwd).append(">");
            sb.append(isValid ? " is acceptable." : " is not acceptable.");
            System.out.println(sb);
        }
    }
}
