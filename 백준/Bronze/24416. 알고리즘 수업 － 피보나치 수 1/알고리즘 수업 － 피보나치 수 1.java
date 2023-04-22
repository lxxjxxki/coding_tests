import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int call1, call2 = 0;
    private static int[] mem;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        mem = new int[T+1];
        fib1(T); fib2(T);
        System.out.print(call1 +" "+ call2);

    }
    static int fib1(int n) {
        if(n==1 || n==2) {
            call1++;
            return 1;
        }
        return fib1(n-1)+fib1(n-2);
    }

    static int fib2(int n) {
        if(n==1 || n==2) return mem[n] = 1;
        for (int i = 2; i < n; i++) {
            call2++;
            mem[i] = mem[i-2] + mem[i-1];
        }
        return mem[n];
    }
}