import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0; i < indices.length; i++) {
            sb.deleteCharAt(indices[i] - i);
        }
        return sb.toString();
    }
}
