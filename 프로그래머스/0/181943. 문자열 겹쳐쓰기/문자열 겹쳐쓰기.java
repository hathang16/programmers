class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int len01 = overwrite_string.length();
        int len02 = my_string.length();
        
        String a = my_string.substring(0,s);
        String b = my_string.substring((s+len01), len02);
        
        answer += a + overwrite_string + b;
        
        return answer;
        
    }
}