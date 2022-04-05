package lambda;

class Solution {

        public static boolean solution(int[] A, int K) {
            int n = A.length;
            for (int i = 0; i < n - 1; i++) {
                if (A[i] + 1 < A[i + 1] )
                    return false;
            }
            if (A[0] != 1  && K != 1)
                return false;
            else
                return true;
        }

    public static void main(String[] args) {
    int[] arr = {1,1,2,3,3};
        System.out.println(solution(arr,21));
    }
}