import java.util.*;

class Solution {
    public int solution(int[] elements) {
        
        HashSet<Integer> HashSet = new HashSet<>();
        int[] Array = new int[2 * elements.length];
        
        //확장
        for (int i = 0; i < elements.length; i++) {
            Array[i] = elements[i];
            Array[i+elements.length] = elements[i];
        }
        
        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += Array[j + k];
                }
                HashSet.add(sum);
            }
        }
        
        int answer = HashSet.size();
        return answer;
    }
}