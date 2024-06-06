import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class ColorValue {
    int value;
    long multiplier;

    ColorValue(int value, long multiplier) {
        this.value = value;
        this.multiplier = multiplier;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, ColorValue> colorMap = new HashMap<>();

        colorMap.put("black", new ColorValue(0, 1));
        colorMap.put("brown", new ColorValue(1, 10));
        colorMap.put("red", new ColorValue(2, 100));
        colorMap.put("orange", new ColorValue(3, 1_000));
        colorMap.put("yellow", new ColorValue(4, 10_000));
        colorMap.put("green", new ColorValue(5, 100_000));
        colorMap.put("blue", new ColorValue(6, 1_000_000));
        colorMap.put("violet", new ColorValue(7, 10_000_000));
        colorMap.put("grey", new ColorValue(8, 100_000_000));
        colorMap.put("white", new ColorValue(9, 1_000_000_000));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String color1 = br.readLine();
        String color2 = br.readLine();
        String multiple = br.readLine();

        StringBuilder sb = new StringBuilder();

        sb.append(colorMap.get(color1).value);
        sb.append(colorMap.get(color2).value);
        int num = Integer.parseInt(sb.toString());

        System.out.println(num * colorMap.get(multiple).multiplier);
    }
}