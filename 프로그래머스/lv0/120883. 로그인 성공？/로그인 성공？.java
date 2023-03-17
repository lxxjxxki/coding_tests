class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        String id = id_pw[0];
        String pw = id_pw[1];

        for(int i = 0; i < db.length; i++){
            String db_id = db[i][0];
            String db_pw = db[i][1];
            if(id.equals(db_id) == false){
                continue;
            }
            if(pw.equals(db_pw) == true){
                answer = "login";
            }
            else{
                answer = "wrong pw";
            }
        }


        return answer;
    }
}