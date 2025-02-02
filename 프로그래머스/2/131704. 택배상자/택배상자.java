import java.util.*;

class Solution {
    public int solution(int[] order) {
        
        Stack<Integer> st = new Stack<>();
        int answer = 0;
        int index = 0;
        int box = 1;
        
        while (box <= order.length || !st.isEmpty()) {
            if (!st.isEmpty() && st.peek() == order[index]) {
                st.pop();
                index++;
                answer++;
            } else if (box <= order.length && box == order[index]) {
                box++;
                index++;
                answer++;
            } else if (box <= order.length) {
                st.push(box);
                box++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}