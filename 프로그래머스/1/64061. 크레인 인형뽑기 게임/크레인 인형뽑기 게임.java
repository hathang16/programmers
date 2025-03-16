import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        int n = board.length;

        for (int i = 0; i < moves.length; i++) {
            int column = moves[i] - 1;

            for (int row = 0; row < n; row++) {
                if (board[row][column] != 0) {
                    int pickedDoll = board[row][column];
                    board[row][column] = 0;

                    if (!basket.isEmpty() && basket.peek() == pickedDoll) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(pickedDoll);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
