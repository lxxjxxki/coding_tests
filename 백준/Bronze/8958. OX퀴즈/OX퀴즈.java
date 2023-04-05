import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int point = 0;
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            solution(s);
        }
    }
    static void solution(String s){
        int answer = 0;
        // ooxxoxxooo
        int plus = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'O'){
                answer += 1 + plus;
                plus++;
            }
            else if(s.charAt(i) == 'X'){
                plus = 0;
            }
        }
        System.out.println(answer);
    }
}