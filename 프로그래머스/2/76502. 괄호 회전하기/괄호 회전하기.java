import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            boolean C = true;
            
            for (int j = 0; j < s.length(); j++) {
                int index = (i + j) % s.length();
                char c = s.charAt(index);
                
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        C = false;
                        break;
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') || 
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                        C = false;
                        break;
                    }
                }
            }

            if (C && stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}