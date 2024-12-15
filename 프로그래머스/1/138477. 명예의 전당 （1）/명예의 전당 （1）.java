class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        int[] honor = new int[k];
        int size = 0;

        for (int i = 0; i < score.length; i++) {
            if (size < k) {
                honor[size] = score[i];
                size++;
            } else {
                int minIndex = 0;
                for (int j = 1; j < size; j++) {
                    if (honor[j] < honor[minIndex]) {
                        minIndex = j;
                    }
                }

                if (score[i] > honor[minIndex]) {
                    honor[minIndex] = score[i];
                }
            }

            int min = honor[0];
            for (int j = 1; j < size; j++) {
                if (honor[j] < min) {
                    min = honor[j];
                }
            }

            answer[i] = min;
        }

        return answer;
    }
}
