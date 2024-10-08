class Solution {
    public String solution(String my_string, String alp) {
        
        String upAlp = alp.toUpperCase();
        
        String answer = my_string.replace(alp, upAlp);
        
        return answer;
    }
}