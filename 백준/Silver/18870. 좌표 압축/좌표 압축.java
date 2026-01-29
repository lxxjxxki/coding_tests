import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> X = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            X.add(tmp);
        }
        ArrayList<Integer> sorted = new ArrayList<>(X);
        Collections.sort(sorted, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        Map<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for (int x : sorted) {
            if(!map.containsKey(x)){
                map.put(x,index++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map.get(X.get(i))).append(' ');
        }
        System.out.print(sb.toString());
    }
}