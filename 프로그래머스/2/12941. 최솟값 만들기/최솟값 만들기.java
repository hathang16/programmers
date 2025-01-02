import java.util.Arrays;

class Solution
{
    public int solution(int[] A, int[] B)
    {
        int answer = 0;

        // A 오름차순으로 정렬
        Arrays.sort(A);

        // B 내림차순으로 정렬
        Arrays.sort(B);
        for (int i = 0; i < B.length / 2; i++) {
            int temp = B[i];
            B[i] = B[B.length - 1 - i];
            B[B.length - 1 - i] = temp;
        }
        
        // A와 B의 곱을 누적하여 answer에 저장
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
}
