import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] n1 = {1,2,3,4,5};
        int[] n2 = {2,1,2,3,2,4,2,5};
        int[] n3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] c = new int[3];
        
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == n1[i % n1.length]) {
                c[0]++;
            }
            if (answers[i] == n2[i % n2.length]) {
                c[1]++;
            }
            if (answers[i] == n3[i % n3.length]) {
                c[2]++;
            }
        }
        
        int maxScore = Math.max(c[0], Math.max(c[1], c[2]));

        List<Integer> topScorers = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == maxScore) {
                topScorers.add(i + 1);
            }
        }
                
        int[] answer = new int[topScorers.size()];
        
        for (int i=0; i<topScorers.size(); i++) {
            answer[i] = topScorers.get(i);
        }
        
        return answer;
    }
}