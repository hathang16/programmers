class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int c_z = 0;
        int c_l = 0;
        
        for (int i = 0; i<lottos.length; i++) {
            if (lottos[i] == 0) {
                c_z++;
            } else {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        c_l++;
                        break;
                    }
                }
            }
        }
        
        int[] rankTable = {6, 6, 5, 4, 3, 2, 1};
        int maxRank = rankTable[c_l + c_z];
        int minRank = rankTable[c_l];

        int[] answer = {maxRank, minRank};
        return answer;
        
    }
}