package codility;

public class CodilityChallenges {
    public static void main(String[] args) {
        System.out.println("Hello, world!");




//        BinaryGap bg = new BinaryGap();
//        System.out.println("Playing around with BinaryGap exercise:\nTestcases are:");
////        int[] testCases = {0, 1, 9, 32, 529, 1041};
//        int[] testCases = {1073741825};
//
//        for (int testCase : testCases) {
//            System.out.print("Number: [" + testCase + "] (" + Integer.toBinaryString(testCase) + ") ");
//            System.out.println("Solution: " + bg.solution(testCase));
//        }


        Demo demo = new Demo();
        Demo2 demo2 = new Demo2();
        int[] testCase = {1, 3, 6, 4, 1, 2};
//        int[] testCase = {-2, 0, 6, 5, 4, 2, 1, 3, 8};

        System.out.println(demo.solution(testCase));
        System.out.println(demo2.solution(testCase));
    }
}
