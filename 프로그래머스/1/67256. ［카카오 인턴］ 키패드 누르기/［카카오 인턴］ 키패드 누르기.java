import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        Map<Integer, int[]> map = new HashMap<>();
        int[][] position = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}, 
            {10, 0, 11}
        };
        
        for (int i = 0; i < position.length; i++) {
            for (int j = 0; j < position[i].length; j++) {
                map.put(position[i][j], new int[]{i, j});
            }
        }
        
        int[] left = map.get(10);
        int[] right = map.get(11);
        
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n == 1 || n == 4 || n == 7) {
                answer += "L";
                left = map.get(n);
            } else if (n == 3 || n == 6 || n == 9) {
                answer +="R";
                right = map.get(n);
            } else if (n == 2 || n == 5 || n == 8 || n == 0) {
                
                int[] target = map.get(n);
                int l = Math.abs(left[0] - target[0]) + Math.abs(left[1] - target[1]);
                int r = Math.abs(right[0] - target[0]) + Math.abs(right[1] - target[1]);
                
                if (l < r) {
                    answer += "L";
                    left = map.get(n);
                } else if (l > r) {
                    answer += "R";
                    right = map.get(n);
                } else {
                    if (hand.equals("right")) {
                        answer += "R";
                        right = map.get(n);
                    } else if (hand.equals("left")) {
                        answer += "L";
                        left = map.get(n);
                    }
                }
            }
        }
        
        return answer;
    }
}