import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int [] di = {a,b,c,d};
        Arrays.sort(di);
        
        // 1.모두 같을 때
        if (di[0] == di[3]){
            answer = 1111 * di[0];
        } // 2. 3개 같음
        else if(di[0] == di[2]) {
            int p = di[0];
            int q = di[3];
            answer = (int) Math.pow(10*p+q,2);
        }
        else if(di[1] == di[3]) {
            int p = di[1];
            int q = di[0];
            answer = (int) Math.pow(10*p+q,2);
        }// 3. 2개씩 같은 값
        else if (di[0]==di[1] && di[2]==di[3]){
            answer = (di[0] + di[3]) * (di[3] - di[0]);
        } // 4. 2개만 같은거
        else if (di[0]==di[1]) {
            answer = di[2] * di[3];
        } 
        else if (di[1]==di[2]) {
            answer = di[0] * di[3];
        }
        else if (di[2]==di[3]) {
            answer = di[0] * di[1];
        } // 5. 4개 모두 다름 
        else {
            answer = di[0];
        }
        
        return answer;
    }
}