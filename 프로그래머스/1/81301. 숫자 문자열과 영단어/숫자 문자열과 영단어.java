class Solution {
    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i=0; i<words.length; i++) {
            if(s.contains(words[i])) {
                s = s.replace(words[i] , Integer.toString(i));
            }
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
}