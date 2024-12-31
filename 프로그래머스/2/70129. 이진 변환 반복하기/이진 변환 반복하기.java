class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            
            int o_z = s.length();
            s = s.replace("0","");
            int c_z = s.length();
            
            answer[1] += (o_z - c_z);
            
            s = Integer.toBinaryString(c_z);
            answer[0]++;
        }
        return answer;
    }
}