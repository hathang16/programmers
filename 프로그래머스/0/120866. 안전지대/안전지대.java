class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] dangerZone = new int[n][n];
        int safeCount = 0;

        // 지뢰가 있는 지역을 기준으로 주변을 위험지역으로 표시
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int dx = -1; dx <= 1; dx++) {
                        for (int dy = -1; dy <= 1; dy++) {
                            int nx = i + dx;
                            int ny = j + dy;
                            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                                dangerZone[nx][ny] = 1;
                            }
                        }
                    }
                }
            }
        }

        // 안전한 지역을 세기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dangerZone[i][j] == 0 && board[i][j] == 0) {
                    safeCount++;
                }
            }
        }

        return safeCount;
    }
}