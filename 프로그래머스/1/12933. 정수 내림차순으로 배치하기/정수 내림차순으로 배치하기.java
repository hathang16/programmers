import java.util.*;

class Solution {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for (int i = list.length - 1; i >= 0; i--) {
            sb.append(list[i]);
        }
        
        long answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}