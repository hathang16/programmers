class Solution {
    boolean solution(String s) {
        int c = 0;
        boolean answer = true;
        
        for (int i = 0; i < s.length(); i++) {
            char C = s.charAt(i);
            
            if (C == '(') {
                c++;
            } else if (C == ')') {
                c--;
                if (c < 0) {
                    answer = false;
                    break;
                }
            }
        }
        if (c != 0) {
            answer = false;
        }
        return answer;
    }
}