class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pc = 0;
        int yc = 0;
        s = s.toLowerCase();
        
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'p') {
                pc++;
            } else if (s.charAt(i) == 'y') {
                yc++;
            }
        }
        
        answer = (pc == yc);

        return answer;
    }
}