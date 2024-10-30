class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String s = Integer.toString(num);
        String[] str = s.split("");
        
        for (int i=0; i<str.length; i++){
            if (str[i].equals(Integer.toString(k))){
                return i+1;
            } 
        }
        
        return -1;
    }
}