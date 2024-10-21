class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int c_1 = 0;
        int c_2 =0;
        
        for (int i=0; i<num_list.length; i++){
            if (num_list[i] % 2 ==0 ){
                c_1++;
            } else {
                c_2++;
            }
        }
        
        answer[0] = c_1;
        answer[1] = c_2;
        
        return answer;
    }
}