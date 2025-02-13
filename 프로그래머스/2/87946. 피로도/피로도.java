class Solution {
    private int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visit = new boolean[dungeons.length];
        dfs(k, dungeons, visit, 0);
        return answer;
    }
    
    private void dfs (int fatigue, int[][] dungeons, boolean[] visit, int count) {
        answer = Math.max(answer, count);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && fatigue >= dungeons[i][0]) {
                visit[i] = true;
                dfs(fatigue - dungeons[i][1], dungeons, visit, count + 1);
                visit[i] = false;
            }
        }
    }
}