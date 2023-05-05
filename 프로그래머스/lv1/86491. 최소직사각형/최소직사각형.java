class Solution {
    public int solution(int[][] card) {
        int w = 1; // 가로
        int h = 1; // 세로
        int tmp = 0;
        for (int i = 0; i < card.length; i++) {
            if (card[i][0] < card[i][1]) {
                tmp = card[i][0];
                card[i][0] = card[i][1];
                card[i][1] = tmp;
            }
        } // swap
        for (int i = 0; i < card.length; i++) {
            if(card[i][0] > w) w = card[i][0];
            if(card[i][1] > h) h = card[i][1];
        }
        int width = w * h;
        return width;
    }
}