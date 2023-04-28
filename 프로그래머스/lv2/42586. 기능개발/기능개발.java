import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> shoot = new ArrayList<>();
        int length = progresses.length;
        int[] work = new int[length];
        for (int i = 0; i < length; i++) {
            work[i] = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);
        }
        int day = work[0];
        int cnt = 1;
        for (int i = 1; i < length; i++){
            if(day < work[i]){
                day = work[i];
                shoot.add(cnt);
                cnt = 1;
            }
            else cnt++;
        }
        shoot.add(cnt);
        return shoot.stream().mapToInt(Integer::intValue).toArray();
    }
}