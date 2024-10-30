class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n>0){
            answer += n % 10;
            n = n / 10;
        }
        
        return answer;
    }
}

// public class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         String s = Integer.toString(n);
        
//         for(int i=0; i<s.length(); i++){
//             answer += Integer.parseInt(s.substring(i, i+1));
//         }
//         return answer;
//     }
// }