package codility;

import java.util.Arrays;

public class MaxCountersNoFill {
    public int[] solution(int N, int[] A) {

        int[] counters = new int[N];
        int maxCounter = 0;
        int currentMaxFill = 0;
        for (int i = 0; i < A.length; i++) {
            int operation = A[i];
            if (operation <= N) {
                counters[operation - 1] = counters[operation - 1] > currentMaxFill ? counters[operation - 1] + 1 : currentMaxFill + 1;
                maxCounter = counters[operation - 1] > maxCounter ? counters[operation - 1] : maxCounter;
            } else {
                currentMaxFill = maxCounter;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < currentMaxFill) {
                counters[i] = currentMaxFill;
            }
        }
        return counters;
    }

    public static void main(String[] args) {

        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;

        MaxCountersNoFill mc = new MaxCountersNoFill();
        Arrays.stream(mc.solution(N, A)).forEach(value -> System.out.print(value + " "));
    }
}
