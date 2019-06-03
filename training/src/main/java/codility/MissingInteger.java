package codility;

import java.util.Arrays;

public class MissingInteger {

    public int solution(int[] A) {

        //sort the array and store the first positive number's position
        Arrays.sort(A);
        int firstPositive = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                firstPositive = i;
                break;
            }
        }

        //check if array has positive numbers
        if (firstPositive < 0) {
            return 1;
        }
        //if 1 isn't there we can just return 1
        if (A[firstPositive] != 1) {
            return 1;
        }

        //compare each number with the one after it
        for (int i = firstPositive; i < A.length - 1; i++) {
            int diffBetweenCurrentAndNext = A[i + 1] - A[i];
            if (diffBetweenCurrentAndNext > 1) {
                return A[i] + 1;
            }
        }
        return A[A.length - 1] + 1;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        int[] A2 = {1, 2, 3};
        int[] A3 = {-1, -3};

        MissingInteger mi = new MissingInteger();

        System.out.println("A  : " + mi.solution(A));
        System.out.println("A2 : " + mi.solution(A2));
        System.out.println("A3 : " + mi.solution(A3));
    }
}
