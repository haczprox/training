package codility;

public class PassingCarsQuadratic {

    //0 - east
    //1 - west
    public int solution(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] != 0) {
                continue;
            }
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] != A[j]) {
                    sum += 1;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] A = {0, 1, 0, 1, 1};

        PassingCars pc = new PassingCars();

        System.out.println(pc.solution(A));

    }
}
