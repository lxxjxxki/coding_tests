import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            String tmp = intStrs[i].substring(s, s + l);
            if (Integer.parseInt(tmp) > k) {
                answer.add(Integer.parseInt(tmp));
            }
        }
        return answer;
    }
}