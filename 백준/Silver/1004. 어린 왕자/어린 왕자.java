import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static class Planet{
        int x;
        int y;
        int r;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            Planet[] planets = new Planet[n];

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                planets[j] = new Planet();
                planets[j].x = Integer.parseInt(st.nextToken());
                planets[j].y = Integer.parseInt(st.nextToken());
                planets[j].r = Integer.parseInt(st.nextToken());
            }
            sb.append(solution(planets,x1,y1,x2,y2)+"\n");
        }
        bw.write(sb + "\n");
        bw.flush();
        bw.close();
    }

    static int solution(Planet[] planets, int x1, int y1, int x2, int y2) {
        int cnt = 0;
        for (int i = 0; i < planets.length; i++) {
            if (Math.pow(planets[i].x - x1, 2) + Math.pow(planets[i].y - y1, 2) <= Math.pow(planets[i].r,2) &&
                    Math.pow(planets[i].x - x2, 2) + Math.pow(planets[i].y - y2, 2) <= Math.pow(planets[i].r,2))
                continue;
            else if (Math.pow(planets[i].x - x1, 2) + Math.pow(planets[i].y - y1, 2) <= Math.pow(planets[i].r,2) ||
                    Math.pow(planets[i].x - x2, 2) + Math.pow(planets[i].y - y2, 2) <= Math.pow(planets[i].r,2)) {
                cnt++;
            }
        }
        return cnt;
    }
}