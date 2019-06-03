package codility;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        if (A.length < 1) {
            return 0;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if ((A[i]) != i + 1) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2};

        PermCheck pc = new PermCheck();
        System.out.println(pc.solution(A));
    }
}
