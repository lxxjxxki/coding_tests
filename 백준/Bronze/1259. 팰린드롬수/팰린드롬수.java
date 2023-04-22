import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        while (true) {
            s = br.readLine();
            if(s.equals("0")) break;
            System.out.println(solution(s));
        }
    }

    public static String solution(String s) {
        return palindrome(s) ? "yes" : "no";
    }

    public static boolean palindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}