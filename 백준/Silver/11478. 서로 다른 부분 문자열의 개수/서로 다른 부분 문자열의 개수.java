import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Set<String> set = new HashSet<String>();

        String str = "";

        for (int i = 0; i < s.length(); i++) {
            str = "";
            for (int j = i; j < s.length(); j++) {
                str += s.substring(j, j + 1);
                set.add(str);
            }
        }
        System.out.println(set.size());
    }
}
