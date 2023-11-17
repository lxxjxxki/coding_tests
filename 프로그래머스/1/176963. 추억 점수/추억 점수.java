import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> memory = new HashMap<>();
        for(int i = 0 ; i < name.length; i++){
            memory.put(name[i], yearning[i]);
        }
        
        int[] result = new int[photo.length];
        
        for(int i = 0 ; i < photo.length; i++){
            int score = 0;
            for(int j =  0 ; j < photo[i].length; j++){
                if(memory.containsKey(photo[i][j]))
                    score += memory.get(photo[i][j]);
            }
            result[i] = score;
        }
        return result;
    }
}