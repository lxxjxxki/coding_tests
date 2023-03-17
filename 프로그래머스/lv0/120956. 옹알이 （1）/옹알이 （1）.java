class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pronunciation = {"aya", "ye", "woo", "ma"};

        for(String b : babbling){
            for(String c : pronunciation){
                b = b.replace(c,"0");
            }
            if(b.replaceAll("0","").equals("")){
                answer++;
            }
        }
        return answer;
    }
}