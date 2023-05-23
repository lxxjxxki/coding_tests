import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> poketmon = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            poketmon.put(nums[i], i);
        }

        return nums.length/2 < poketmon.size() ? nums.length/2 : poketmon.size();
    }
}