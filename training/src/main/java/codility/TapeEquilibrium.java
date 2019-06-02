package codility;


public class TapeEquilibrium {
    public int solution(int[] A) {

        int minDifference = Integer.MAX_VALUE;
        int currentDifference;
        int partialSum = 0;
        int totalSum = 0;

        for (int value : A) {
            totalSum += value;
        }

        for (int i = 0; i < A.length - 1; i++) {
            partialSum += A[i];
            currentDifference = Math.abs((totalSum - partialSum) - partialSum);
            minDifference = minDifference < currentDifference ? minDifference : currentDifference;
        }
        return minDifference;
    }

    public static void main(String[] args) {

        int[] A = {3, 1, 2, 4, 3};

        TapeEquilibrium te = new TapeEquilibrium();

        System.out.println(te.solution(A));
    }
}
