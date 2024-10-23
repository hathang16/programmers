class Solution {
    public String solution(int age) {
        String answer = "";
        
        while (age > 0){
            int d = age % 10;
            char a = (char) ( d + 'a');
            answer = a + answer;
            age /= 10 ;
        }
        
        return answer;
    }
}