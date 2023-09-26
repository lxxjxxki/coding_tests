import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    
    
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 1<=MM<=12, 01,02 ... , 1<=DD<=28, 01,02,...
        int intToday = (Integer.parseInt(today.substring(0, 4)) - 2000) * 12 * 28 + (Integer.parseInt(today.substring(5, 7))) * 28 + Integer.parseInt(today.substring(8, 10));

        int[] intPrivacyDate = new int[privacies.length];
        char[] term = new char[privacies.length];
        for (int i = 0; i < privacies.length; i++) {
            intPrivacyDate[i] = (Integer.parseInt(privacies[i].substring(0, 4)) - 2000) * 12 * 28 + (Integer.parseInt(privacies[i].substring(5, 7))) * 28 + Integer.parseInt(privacies[i].substring(8, 10));
            term[i] = privacies[i].charAt(11);
        }

        char[] termSort = new char[terms.length];
        int[] termValidDate = new int[terms.length];
        for (int i = 0; i < terms.length; i++) {
            termSort[i] = terms[i].charAt(0);
            if (terms[i].length() > 3) {
                termValidDate[i] = Integer.parseInt(terms[i].substring(2, terms[i].length())) * 28;
            } else {
                termValidDate[i] = (terms[i].charAt(2) - '0') * 28;
            }
        }
        for (int i = 0; i < privacies.length; i++) {
            for (int j = 0; j < terms.length; j++) {
                if (term[i] == termSort[j]) {
                    // termSort에 맞는 유효기간을 intPrivacyDate에 더하고 today와 비교
                    int tmp = (termValidDate[j] + intPrivacyDate[i]);
                    System.out.println("tmp : " + tmp);
                    System.out.println("today : " + intToday);
                    if (tmp <= intToday) {
                        answer.add(i+1);
                    }
                }
            }
        }
        int[] ans = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            ans[i] = answer.get(i);
        }
        return ans; // 파기
    }
}