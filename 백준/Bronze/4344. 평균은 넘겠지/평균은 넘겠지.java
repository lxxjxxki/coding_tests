import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());

        int[] tmp = new int[1000];
        for(int i = 0; i < C; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            tmp = new int[N];
            int total = 0;
            for(int j = 0; j < N; j++) {
                tmp[j] = Integer.parseInt(st.nextToken());
                total += tmp[j];
            }
            float mid = total / N;
            float cnt = 0;
            for(int k = 0; k < N; k++){
                if(tmp[k] > mid)
                    ++cnt;
            }
            float ans = cnt / N * 100;
            System.out.println(String.format("%.3f", ans) + "%");
        }
    }
}