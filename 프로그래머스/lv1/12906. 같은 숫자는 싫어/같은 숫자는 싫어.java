import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        st.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (st.peek() != arr[i]) {
                st.add(arr[i]);
            }
        }
        return st;
    }
}