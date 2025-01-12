class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ",-1);
        
        for (int i = 0; i < words.length; i++) {
            String word =  words[i];
            if (word.length() > 0) {
                answer += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            }
            
            if (i < words.length - 1) {
                answer += " ";
            }
        }
        
        return answer;
    }
}