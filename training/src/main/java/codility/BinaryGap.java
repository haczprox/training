package codility;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    private static List<Integer> positionsForOnes = new ArrayList<Integer>();


    public static int solution(int n) {

        char[] binaryString = Integer.toBinaryString(n).toCharArray();
        System.out.println(binaryString);
        int maxGap = 0;

        for (int i = 0; i < binaryString.length; i++) {
            if (binaryString[i] == '1') {
                positionsForOnes.add(i);
            }
        }

        int numberOfOnes = positionsForOnes.size();
        int currentGap = 0;
        if (numberOfOnes < 2) {
            return 0;
        } else if (numberOfOnes > 2) {
            for (int i = 0; i < positionsForOnes.size() - 1; i++) {
                currentGap = positionsForOnes.get(i + 1) - positionsForOnes.get(i) - 1;
                maxGap = currentGap > maxGap ? currentGap : maxGap;
            }

        } else {
            return positionsForOnes.get(1) - positionsForOnes.get(0) - 1;
        }
        return maxGap;
    }

    public static void main(String[] args) {
        System.out.println("Solution for 32 is: ");
        System.out.println(solution(1073741825));
    }
}
