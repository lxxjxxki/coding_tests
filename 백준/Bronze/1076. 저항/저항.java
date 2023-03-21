import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> map = new HashMap<>(){{
            put("black","0");
            put("brown", "1");
            put("red", "2");
            put("orange", "3");
            put("yellow", "4");
            put("green", "5");
            put("blue", "6");
            put("violet", "7");
            put("grey", "8");
            put("white", "9");
        }
        };
        String color1 = br.readLine();
        String color2 = br.readLine();
        String color3 = br.readLine();
        long answer = Long.parseLong(map.get(color1) + map.get(color2));
        answer *= Math.pow(10.0, (double) Integer.parseInt(map.get(color3)));
        System.out.println(answer);
    }
}