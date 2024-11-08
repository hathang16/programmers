import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> rankMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }
        
        for (int i=0; i<callings.length; i++){
            String calling = callings[i];
            
            int currentRank = rankMap.get(calling);
            if (currentRank > 0) {
                int previousRank = currentRank - 1;
                
                String previousPlayer = players[previousRank];
                
                players[previousRank] = calling;
                players[currentRank] = previousPlayer;
                
                rankMap.put(calling, previousRank);
                rankMap.put(previousPlayer, currentRank);
            }
        }
        
        return players;
    }
}
