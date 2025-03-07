import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        
        boolean[][] visit = new boolean[maps.length][maps[0].length];
        
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[] {0, 0, 1});
        visit[0][0] = true;
        
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            int count = now[2];
            
            //목표지점
            if (x == maps.length - 1 && y == maps[0].length - 1) {
                return count;
            }
            
            //상
            if (x - 1 >= 0 && maps[x - 1][y] == 1 && !visit[x - 1][y]) {
                visit[x - 1][y] = true;
                q.add(new int[]{x - 1, y, count + 1});
            }
            
            //하
            if (x + 1 < maps.length && maps[x + 1][y] == 1 && !visit[x + 1][y]) {
                visit[x + 1][y] = true;
                q.add(new int[]{x + 1, y, count + 1});
            }
            
            //좌
            if (y - 1 >= 0 && maps[x][y - 1] == 1 && !visit[x][y - 1]) {
                visit[x][y - 1] = true;
                q.add(new int[]{x, y - 1, count + 1});
            }
            
            //우
            if (y + 1 < maps[0].length && maps[x][y + 1] == 1 && !visit[x][y + 1]) {
                visit[x][y + 1] = true;
                q.add(new int[]{x, y + 1, count + 1});
            }
        }
        return answer;
    }
}