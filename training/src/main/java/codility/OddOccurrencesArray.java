package codility;

import java.util.HashMap;

public class OddOccurrencesArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int number : A) {
            if (numbers.containsKey(number)) {
                numbers.remove(number);
            } else {
                numbers.put(number, number);
            }
        }

        return numbers.keySet().iterator().next();
    }

    public static void main(String[] args) {
        OddOccurrencesArray ooa = new OddOccurrencesArray();
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println("Solution is: " + ooa.solution(A));
    }
}
