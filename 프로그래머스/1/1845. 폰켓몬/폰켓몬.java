import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        List<Integer> p = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!p.contains(nums[i])) {
                p.add(nums[i]);
            }
        }
        
        int answer = Math.min(p.size(), nums.length / 2);
        return answer;
    }
}