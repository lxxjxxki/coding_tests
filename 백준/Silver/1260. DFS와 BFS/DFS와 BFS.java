import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static boolean[] visited = new boolean[1001];
    public static int[][] graph = new int[1001][1001];

    static int node, line, start;
    static Queue<Integer> q = new LinkedList<>();

    public static int n;
    public static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }

        dfs(start);
        sb.append("\n");
        Arrays.fill(visited, false);
        bfs(start);
        System.out.println(sb);
    }
    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start + " ");

        for(int i = 0 ; i <= n ; i++) {
            if(graph[start][i] == 1 && !visited[i])
                dfs(i);
        }
    }

    public static void bfs(int start) {
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()) {

            start = q.poll();
            sb.append(start + " ");

            for(int i = 1 ; i <= n ; i++) {
                if(graph[start][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}