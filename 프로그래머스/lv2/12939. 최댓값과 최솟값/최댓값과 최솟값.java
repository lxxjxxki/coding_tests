import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s, " ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            arrayList.add(n);
        }
        Collections.sort(arrayList);
        answer += Integer.toString(arrayList.get(0)) +" "+ Integer.toString(arrayList.get(arrayList.size() - 1));
        return answer;
    }
}