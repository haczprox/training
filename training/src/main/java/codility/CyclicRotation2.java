package codility;

import java.util.Arrays;

public class CyclicRotation2 {
    public int[] solution(int[] A, int K) {
        if (A.length < 1 || K == 0) {
            return A;
        }

        int numRotations = K % A.length;
        int[] shiftedArr = new int[A.length];

        if (numRotations >= 0) System.arraycopy(A, A.length - numRotations, shiftedArr, 0, numRotations);
        if (numRotations >= 0) System.arraycopy(A, 0, shiftedArr, numRotations, A.length - numRotations);

        return shiftedArr;
    }

    public static void main(String[] args) {
        CyclicRotation2 cr = new CyclicRotation2();

        int[] A = {1, 1, 2, 3, 5};
        int K = 42;
        Arrays.stream(cr.solution(A, K)).forEach(value -> System.out.print(value + " "));

    }
}
