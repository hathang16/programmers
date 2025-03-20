import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int row = park.length;
        int col = park[0].length;

        Arrays.sort(mats);

        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];

            for (int r = 0; r <= row - size; r++) {
                for (int c = 0; c <= col - size; c++) {
                    boolean b = true;

                    for (int x = 0; x < size; x++) {
                        for (int y = 0; y < size; y++) {
                            if (!park[r + x][c + y].equals("-1")) {
                                b = false;
                                break;
                            }
                        }
                        if (!b) break;
                    }

                    if (b) {
                        answer = size;
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}
