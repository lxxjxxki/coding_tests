import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        for (int i = 1; i <= n; i++) {
            if(q.size()==1) break;
            q.remove();
            q.add(q.poll());
        }
        System.out.println(q.poll());
    }
}