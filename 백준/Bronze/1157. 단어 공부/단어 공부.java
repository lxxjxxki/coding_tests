import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        s = s.toUpperCase();
        int[] dic = new int['Z'-'A'+1];
        for(int i = 0; i < 'Z'-'A'+1; i++){
            dic[i] = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == 'A'+i){
                    dic[i]++;
                }
            }
        }
        int max = 0;
        for(int i = 0; i < 'Z'-'A'+1; i++){
            if(dic[i] > max)
                max = dic[i];
        }
        int cnt = 0;
        char ans = ' ';
        for(int i = 0; i < 'Z'-'A'+1; i++){
            if(dic[i] == max) {
                cnt++;
                ans = (char)(i+'A');
            }
        }
        if(cnt > 1)
            System.out.print("?");
        else
            System.out.print(ans);
    }
}