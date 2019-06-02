package codility;

import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] A) {
        if (A.length < 1) {
            return 1;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }
        return A[A.length - 1] + 1;
    }

    public static void main(String[] args) {

        PermMissingElem pme = new PermMissingElem();
        int[] A = {2, 3, 1, 5, 6, 4};

        System.out.println(pme.solution(A));

    }
}
