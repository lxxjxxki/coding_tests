import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        System.out.print(solution(N));
    }
    static int solution(int N){
        // 3, 5
        int answer = 0;
        if(!isPossible(N) == true)
            return -1;
        for(int i = 0; i <= 5000/5; i++){
            for(int j = 0; j <= 5000/3; j++){
                if(N == 5*i + 3*j) {
                    answer = i + j;
                }
            }
        }
        return answer;
    }
    static boolean isPossible(int N){
        boolean answer = false;
        for(int i = 0; i <= 5000/5; i++){
            for(int j = 0; j <= 5000/3; j++){
                if(N == 5*i + 3*j) {
                    answer = true;
                    continue;
                }
            }
        }
        return answer;
    }
}