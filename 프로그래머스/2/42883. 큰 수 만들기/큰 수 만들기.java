class Solution {
    public String solution(String number, int k) {
        String answer = "";
        char[] stack = new char[number.length() - k];
        int top = 0;
        
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            
            while (top > 0 && stack[top - 1] < digit && k > 0) {
                top--;
                k--;
            }
            
            if (top < stack.length) {
                stack[top++] = digit;
            }
        }
        
        answer = new String(stack);
        return answer;
    }
}