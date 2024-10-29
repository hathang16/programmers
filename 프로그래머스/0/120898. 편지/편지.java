class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] str = message.split("");
        
        for(int i=1; i<=str.length; i++){
            answer = (i*2);
        }     
        
        return answer;
    }
}

// class Solution {
//     public int solution(String message) {
        
//         int answer = message.length() * 2;
        
//         return answer;
//     }
// }