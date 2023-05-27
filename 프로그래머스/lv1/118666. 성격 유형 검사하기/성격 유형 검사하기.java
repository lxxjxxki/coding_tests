import java.util.Arrays;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        int[] arr = new int[8];
        // RT, CF, JM, AN
        Arrays.fill(arr, 0);
        for (int i = 0; i < survey.length; i++) {
            String a = survey[i].split("")[0];
            String b = survey[i].split("")[1];

            if (choices[i] > 4) {
                // 오른쪽
                arr[trans(b)] += (choices[i] - 4);
            } else if (choices[i] < 4) {
                // 왼쪽
                arr[trans(a)] += (4 - choices[i]);
            }
        }

        for (int i = 0; i < 4; i++) {
            if (arr[2 * i + 1] > arr[2 * i]) {
                if (i == 0) answer += "T";
                if (i == 1) answer += "F";
                if (i == 2) answer += "M";
                if (i == 3) answer += "N";
            } else {
                if (i == 0) answer += "R";
                if (i == 1) answer += "C";
                if (i == 2) answer += "J";
                if (i == 3) answer += "A";
            }
        }
        return answer;
    }
    public int trans(String str) {
        switch (str) {
            case "R":
                return 0;
            case "T":
                return 1;
            case "C":
                return 2;
            case "F":
                return 3;
            case "J":
                return 4;
            case "M":
                return 5;
            case "A":
                return 6;
            case "N":
                return 7;
        }
        return 8;
    }
}