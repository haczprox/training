package codility;

public class FrogRiverOne {
    public int solution(int X, int[] A) {


        int[] filledPositions = new int[X];
        int numberOfFilledPositions = 0;
        int currentLeaf;

        for (int i = 0; i < A.length; i++) {
            currentLeaf = A[i];
            if (filledPositions[currentLeaf - 1] == 0) {
                filledPositions[currentLeaf - 1] = 1;
                numberOfFilledPositions++;

                if (numberOfFilledPositions == X) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int[] A2 = {3};
        int X = 5;

        FrogRiverOne fro = new FrogRiverOne();
        System.out.println("Example1: " + fro.solution(X, A));

        System.out.println("Example2: "  + fro.solution(X, A2));
    }
}
