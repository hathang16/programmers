class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int number = 0;
        
        while (sb.length() < t * m) {
            sb.append(Integer.toString(number++, n).toUpperCase());
        }
        
        for (int i = 0; i < t; i++) {
            answer += sb.charAt(p - 1 + i * m);
        }
        
        return answer;
    }
}