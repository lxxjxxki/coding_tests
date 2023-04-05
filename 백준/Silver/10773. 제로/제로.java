import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        while(K--!=0){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                stack.pop();
                continue;
            }
            stack.push(n);
        }
        while(stack.size() != 0){
            sum += stack.pop();
        }
        System.out.print(sum);
    }
}