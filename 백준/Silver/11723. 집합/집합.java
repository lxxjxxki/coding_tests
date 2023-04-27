import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> s = new ArrayList<Integer>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String inst = st.nextToken();
            switch (inst) {
                case "add":
                    s.add(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    int checkNum = Integer.parseInt(st.nextToken());
                    if (s.contains(checkNum) == true) bw.write(1+"\n");
                    else bw.write(0+"\n");
                    break;
                case "remove":
                    int removeNum = Integer.parseInt(st.nextToken());
                    if(s.contains(removeNum)) {
                        int x = s.indexOf(removeNum);
                        s.remove(x);
                    }
                    break;
                case "toggle":
                    int toggleNum = Integer.parseInt(st.nextToken());
                    if (s.contains(toggleNum) == true) {
                        int x = s.indexOf(toggleNum);
                        s.remove(x);
                    }
                    else s.add(toggleNum);
                    break;
                case "all":
                    s.clear();
                    for (int j = 1; j <= 20; j++) {
                        s.add(j);
                    }
                    break;
                case "empty":
                    s.clear();
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}