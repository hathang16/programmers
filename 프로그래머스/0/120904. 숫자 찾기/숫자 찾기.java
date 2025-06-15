class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String s = Integer.toString(num);
        String[] str = s.split("");
        
        for (int i = 0; i < str.length; i++){
            if (str[i].equals(Integer.toString(k))){
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}