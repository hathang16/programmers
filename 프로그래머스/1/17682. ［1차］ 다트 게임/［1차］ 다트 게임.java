class Solution {
    public int solution(String dartResult) {
        int[] s = new int[3];
        int index = -1;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if (Character.isDigit(c)) {
                if (c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    s[++index] = 10;
                    i++;
                } else {
                    s[++index] = c - '0';
                }
            } else if (c == 'S') {
                s[index] = (int) Math.pow(s[index], 1);
            } else if (c == 'D') {
                s[index] = (int) Math.pow(s[index], 2);
            } else if (c == 'T') {
                s[index] = (int) Math.pow(s[index], 3);
            } else if (c == '*') {
                s[index] *= 2;
                if (index > 0) {
                    s[index - 1] *= 2;
                }
            } else if (c == '#') {
                s[index] *= -1;
            }
        }
        
        int answer = 0;
        for (int i = 0; i < s.length; i++) {
            answer += s[i];
        }
        return answer;
    }
}