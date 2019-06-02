package codility;

import java.util.stream.IntStream;


public class TapeEquilibrium2 {
    public int solution(int[] A) {

        int minDifference = Integer.MAX_VALUE;
        int currentDifference;
        int partialSum = 0;

        int totalSum = IntStream.of(A).sum();

        for (int i = 0; i < A.length - 1; i++) {
            partialSum += A[i];
            currentDifference = Math.abs((totalSum - partialSum) - partialSum);
            minDifference = minDifference < currentDifference ? minDifference : currentDifference;
        }
        return minDifference;
    }

    public static void main(String[] args) {

        int[] A = {3, 1, 2, 4, 3};

        TapeEquilibrium2 te = new TapeEquilibrium2();

        System.out.println(te.solution(A));
    }
}
