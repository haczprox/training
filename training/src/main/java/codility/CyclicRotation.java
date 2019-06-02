package codility;

import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if (A.length < 1 || K == 0) {
            return A;
        }

        int numRotations = K % A.length;
        int[] shiftedArr = new int[A.length];

        for (int i = 0; i < numRotations; i++) {
            shiftedArr[i] = A[A.length - numRotations + i];
        }

        for (int i = numRotations, j = 0; i < A.length; i++, j++) {
            shiftedArr[i] = A[j];
        }
        return shiftedArr;
    }

    public static void main(String[] args) {
        CyclicRotation cr = new CyclicRotation();

        int[] A = {1, 1, 2, 3, 5};
        int K = 42;
        Arrays.stream(cr.solution(A, K)).forEach(value -> System.out.print(value + " "));

    }
}
