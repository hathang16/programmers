class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        
        for (int i = 0; i < 4; i++) {
            int c_h = h + dh[i];
            int c_w = w + dw[i];
            
            if (c_h >= 0 && c_h < board.length && c_w >= 0 && c_w < board.length) {
                if (board[c_h][c_w].equals(board[h][w])) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}