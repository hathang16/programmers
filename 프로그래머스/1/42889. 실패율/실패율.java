import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] count = new int[N + 2];
        
        for (int i = 0; i < stages.length; i++) {
            int stage = stages[i];
            count[stage]++;
        }
        
        int player = stages.length;
        Stage[] stageList = new Stage[N];
        
        for (int i = 0; i < N; i++) {
            int num = i + 1;
            double rate;
            
            if (player == 0) {
                rate = 0;
            } else {
                rate = (double) count[num] / player;
            }
            
            stageList[i] = new Stage(num, rate);
            player -= count[num];
        }
        
        Arrays.sort(stageList, new Comparator<Stage>() {
            public int compare(Stage a, Stage b) {
                if (a.rate == b.rate) {
                    return a.stage - b.stage;
                } else {
                    return Double.compare(b.rate, a.rate);
                }
            }
        });
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageList[i].stage;
        }
        
        return answer;
    }
}

class Stage {
    int stage;
    double rate;
    
    Stage(int stage, double rate) {
        this.stage = stage;
        this.rate = rate;
    }
}
