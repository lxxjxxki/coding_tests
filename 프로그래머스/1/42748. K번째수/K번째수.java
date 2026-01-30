import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>(commands.length);
        for (int index = 0; index < commands.length; index++) {
            int i = commands[index][0];
            int j = commands[index][1];
            int k = commands[index][2];

            int[] copy = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(copy);
            answer.add(copy[k - 1]);
        }
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}