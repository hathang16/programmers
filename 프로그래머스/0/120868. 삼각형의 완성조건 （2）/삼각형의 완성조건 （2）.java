import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        int max = sides[0] + sides[1] - 1;
        int min = sides[1] - sides[0] + 1;
        
        answer = max - min + 1;
        return answer;
    }
}