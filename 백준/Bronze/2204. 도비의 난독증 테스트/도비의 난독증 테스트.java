import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";



        while(true){
            input = br.readLine();
            if(input.equals("0")){
                break;
            }
            int num = Integer.parseInt(input);

            List<String> list = new ArrayList<>();

            for(int i = 0; i < num; i++){
                list.add(br.readLine());
            }

            list.sort(String.CASE_INSENSITIVE_ORDER);
            System.out.println(list.get(0));
        }


    }
}