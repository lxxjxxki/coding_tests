import java.util.Arrays;

class Solution {
    private int[] mem = new int[100001];
    public int fib(int n) {
        if (mem[n] != -1) return mem[n];
        if(n < 2) return mem[n] = n;
        return mem[n] = (fib(n-1) + fib(n-2)) % 1234567;
    }

    public int solution(int n){
        Arrays.fill(mem, -1);
        for (int i : mem) {
            fib(n);
        }
        return fib(n);
    }
}