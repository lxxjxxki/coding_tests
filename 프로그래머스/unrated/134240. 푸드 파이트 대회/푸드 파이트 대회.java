class Solution {
    public String solution(int[] food) {
        String answer = "";
        String answer1 = "";
        String answer2 = "";
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i]/2; j++){
                answer1 += Integer.toString(i);
            }
        }
        answer1 += Integer.toString(0);
        
        for(int j = answer1.length() - 2; j >= 0; j--){
                answer2 += answer1.charAt(j);
            }
        answer = answer1 + answer2;
        return answer;
    }
    // String ㅂㅅ
}