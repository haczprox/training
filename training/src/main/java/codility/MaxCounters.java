package codility;

import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int N, int[] A) {

        int[] counters = new int[N];
        int maxCounter = 0;
                for (int i = 0; i < A.length; i++) {
            int operation = A[i];
            if (operation <= N) {
                maxCounter = ++counters[operation - 1] > maxCounter ? counters[operation - 1] : maxCounter;
            } else {
                Arrays.fill(counters, maxCounter);
            }
        }
        return counters;
    }

    public static void main(String[] args) {

        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;

        MaxCounters mc = new MaxCounters();
        Arrays.stream(mc.solution(N, A)).forEach(value -> System.out.print(value + " "));
    }
}
