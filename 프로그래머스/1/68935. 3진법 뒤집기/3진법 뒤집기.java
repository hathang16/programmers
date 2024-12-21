class Solution {
    public int solution(int n) {
        String n_3 = Integer.toString(n,3);
        String n_10 ="";
        
        for (int i = n_3.length()-1; i >= 0; i--) {
            n_10 += n_3.charAt(i);
        }
        
        
        int answer = Integer.parseInt(n_10,3);
        
        return answer;
    }
}