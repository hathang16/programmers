class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                answer += ch[i];
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                answer += (char) ('a' + (ch[i] + n - 'a') % 26);
            } else {
                answer += (char) ('A' + (ch[i] + n - 'A') % 26);
            }
        }

        return answer;
    }
}
