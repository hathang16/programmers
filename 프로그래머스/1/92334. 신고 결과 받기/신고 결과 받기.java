class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] reportedCount = new int[id_list.length];
        boolean[][] reportTable = new boolean[id_list.length][id_list.length];

        for (int i = 0; i < report.length; i++) {
            String[] parts = report[i].split(" ");
            String reporter = parts[0];
            String reported = parts[1];

            int reporterIndex = findIndex(id_list, reporter);
            int reportedIndex = findIndex(id_list, reported);

            if (!reportTable[reporterIndex][reportedIndex]) {
                reportTable[reporterIndex][reportedIndex] = true;
                reportedCount[reportedIndex]++;
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            if (reportedCount[i] >= k) {
                for (int j = 0; j < id_list.length; j++) {
                    if (reportTable[j][i]) {
                        answer[j]++;
                    }
                }
            }
        }

        return answer;
    }

    private int findIndex(String[] id_list, String name) {
        for (int i = 0; i < id_list.length; i++) {
            if (id_list[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
