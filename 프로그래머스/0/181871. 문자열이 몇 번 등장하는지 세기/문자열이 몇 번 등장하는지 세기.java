class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = myString.length(); i >= 0; i--) {
            String sb = myString.substring(0, i);
            if (sb.endsWith(pat)) {
                answer++;
            }
        }
        return answer;
    }
}