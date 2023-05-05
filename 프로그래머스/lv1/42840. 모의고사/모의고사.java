import java.io.*;
import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] ppl1 = {1, 2, 3, 4, 5};
        int[] ppl2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ppl3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[4];
        Arrays.fill(cnt, 0);

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == ppl1[i % ppl1.length]) cnt[1]++;
            if (answers[i] == ppl2[i % ppl2.length]) cnt[2]++;
            if (answers[i] == ppl3[i % ppl3.length]) cnt[3]++;
        }
        int max = 0;
        for (int i = 1; i < 4; i++) {
            if(cnt[i] > max) max = cnt[i];
        }
        for (int i = 1; i < 4; i++) {
            if(max == cnt[i]) answer.add(i);
        }

        return answer;
    }
}