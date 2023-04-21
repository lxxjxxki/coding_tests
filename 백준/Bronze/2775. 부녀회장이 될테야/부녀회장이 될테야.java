import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int[][] apt = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < 15; i++) {
            Arrays.fill(apt[i], -1);
        }
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(solution(k, n));
        }
    }

    static int solution(int k, int n) {
        if(n==1) return 1;
        if(k==0) return n;
        return apt[k][n] = solution(k,n-1) + solution(k - 1, n);
    }
}