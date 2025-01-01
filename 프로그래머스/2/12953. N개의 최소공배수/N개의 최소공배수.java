class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int a = answer;
            int b = arr[i];

            // 최대공약수 계산
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            // 최소공배수 계산
            answer = (answer * arr[i]) / a;
        }

        return answer;
    }
}