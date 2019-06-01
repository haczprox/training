package codility;

import java.util.Arrays;

public class Demo {
    public int solution(int[] A) {
        //use stream to sort and filter array and use the resulting array
        int[] positiveNumbersGreaterThanZero = Arrays.stream(A).filter(s -> s > 0).sorted().toArray();

        //check if array has positive numbers
        if (positiveNumbersGreaterThanZero.length < 1) {
            return 1;
        }

        //if 1 isn't there we can just return 1
        if (positiveNumbersGreaterThanZero[0] != 1) {
            return 1;
        }

        if (positiveNumbersGreaterThanZero.length == 1) {
            return positiveNumbersGreaterThanZero[0] + 1;
        }

        //compare each number with the one after it
        for (int i = 0; i < positiveNumbersGreaterThanZero.length - 1; i++) {
            int diffBetweenCurrentAndNext = positiveNumbersGreaterThanZero[i + 1] - positiveNumbersGreaterThanZero[i];
            if (diffBetweenCurrentAndNext > 1) {
                return positiveNumbersGreaterThanZero[i] + 1;
            }
        }
        return positiveNumbersGreaterThanZero[positiveNumbersGreaterThanZero.length - 1] + 1;
    }
}
