import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        k = k - 1;

        for (int i = 0; i < n; i++) {
            factorial = factorial / (n - i);
            int index = (int) (k / factorial);
            answer[i] = list.get(index);
            list.remove(index);
            k = k % factorial;
        }

        return answer;
    }
}
