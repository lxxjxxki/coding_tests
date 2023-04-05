import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, EmptyStackException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push"))
                stack.push(Integer.parseInt(st.nextToken()));
            if(str.equals("pop")){
                if(stack.isEmpty())
                    sb.append(-1 + "\n");
                else
                    sb.append(stack.pop() + "\n");
            }
            if(str.equals("size"))
                sb.append(stack.size() + "\n");
            if(str.equals("empty")){
                if(stack.isEmpty()){
                    sb.append(1 + "\n");
                }
                else
                    sb.append(0 + "\n");
            }
            if(str.equals("top")){
                if(stack.isEmpty())
                    sb.append(-1 + "\n");
                else
                    sb.append(stack.peek() + "\n");
            }
        }
        bw.write(sb + "");
        br.close();
        bw.flush();
        bw.close();
    }
}