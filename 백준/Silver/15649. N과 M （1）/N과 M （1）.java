import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static boolean[] isUsed;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        isUsed = new boolean[n + 1];
        arr = new int[n + 1];
        go(0);
        System.out.println(sb);
    }

    public static void go(int index) {
        if (index == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append('\n');
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(isUsed[i]) continue; // 선택한 적 있으면 다음
            isUsed[i] = true; // 선택
            arr[index] = i;
            go(index + 1);
            isUsed[i] = false;
        }
    }
}