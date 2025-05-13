class Solution {
    public int solution(int order) {
        int answer = 0;
        
         String orderStr = String.valueOf(order);
        
        for(int i = 0; i < orderStr.length(); i++){
            char ch = orderStr.charAt(i);
            
            if (ch == '3' || ch == '6' || ch == '9'){
                answer++;
            }
        }
        
        return answer;
    }
}