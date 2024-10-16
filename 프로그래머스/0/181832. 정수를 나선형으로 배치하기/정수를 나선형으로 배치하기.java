class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (num <= n * n) {
            // 오른쪽으로 이동
            for (int i = left; i <= right && num <= n * n; i++) {
                answer[top][i] = num++;
            } top++;

            // 아래로 이동
            for (int i = top; i <= bottom && num <= n * n; i++) {
                answer[i][right] = num++;
            } right--;

            // 왼쪽으로 이동
            for (int i = right; i >= left && num <= n * n; i--) {
                answer[bottom][i] = num++;
            } bottom--;

            // 위로 이동
            for (int i = bottom; i >= top && num <= n * n; i--) {
                answer[i][left] = num++;
            } left++;
        }

        return answer;
    }
}
