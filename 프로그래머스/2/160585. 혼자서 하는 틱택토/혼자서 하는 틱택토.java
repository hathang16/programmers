class Solution {
    public int solution(String[] board) {
        int answer = 1;
        int c_o = 0;
        int c_x = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j ++) {
                char c = board[i].charAt(j);
                if (c == 'O') {
                    c_o++;
                } else if (c == 'X') {
                    c_x++;
                }
            }
        }
        
        if (c_o < c_x || c_o - c_x > 1) {
            answer = 0;
        }
        
        boolean w_o = win(board, 'O');
        boolean w_x = win(board, 'X');
        
        // 둘이 동시에 이기기 X
        if (w_o && w_x) {
            answer = 0;
        }
        // o가 이기면 o와 x의 개수는 같을수 없음
        if (w_o && c_o == c_x) {
            answer = 0;
        }
        // x가 이기면 o와 x의 개수는 같아야함
        if (w_x && c_o > c_x) {
            answer = 0;
        }
        
        return answer;
    }
    
    private boolean win(String[] board, char player) {
        
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == player && board[i].charAt(1) == player && board[i].charAt(2) == player) {
                return true;
            }
            if (board[0].charAt(i) == player && board[1].charAt(i) == player && board[2].charAt(i) == player) {
                return true;
            }
        }
        
        if (board[0].charAt(0) == player && board[1].charAt(1) == player && board[2].charAt(2) == player) {
            return true;
        }
        if (board[0].charAt(2) == player && board[1].charAt(1) == player && board[2].charAt(0) == player) {
            return true;
        }
        return false;
    }
}