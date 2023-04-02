import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        bw.write(Solution(N) + "");
        br.close();
        bw.flush();
        bw.close();
    }
    public static int recursive(int num, int answer){
        if(num < 100){
            return 99 + answer;
        }
        int x = num / 100;
        int y = (num % 100) / 10;
        int z = num % 10;
        if((x-y) == (y-z)) answer++;
        return recursive(num-1, answer);
    }
    public static int Solution(int num){
        int answer = 0;
        if(num == 1000) return 144;
        else if(num < 100) return num;

        return recursive(num, answer);
    }
}