package codility;

public class PassingCars {

    //0 - east
    //1 - west
    //  create array with length of A. count number of 1's until A[x]. sweep aux array at the end
    public int solution(int[] A) {
        long sum = 0;
        int onesSoFar = 0;
        int totalOnes = 0;
        int[] auxA = new int[A.length];
        //count number of 1's in A
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                totalOnes += 1;
            }
        }

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == 1) {
                onesSoFar++;
            } else {
                auxA[i] = totalOnes - onesSoFar;
            }
        }

        for (int i = 0; i < auxA.length; i++) {
            sum += auxA[i];
        }
        return (int) sum < 1000000000 ? (int) sum : -1;
    }

    public static void main(String[] args) {

        int[] A = {0, 1, 0, 1, 1};

        PassingCars pc = new PassingCars();

        System.out.println(pc.solution(A));

    }
}
