class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int s = 0;
        int m = 1;
        
        for (int i =0; i<num_list.length; i++){
            s += num_list[i];
            m *= num_list[i];
        }
        if (s*s > m){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}