package codility;

public class FrogJmp {
    public int solution(int X, int Y, int D) {

        int distance = Y - X;

        return (int)Math.ceil(distance / (double)D);
    }

    public static void main(String[] args) {

        int X = 10;
        int Y = 85;
        int D = 30;
        FrogJmp frog = new FrogJmp();
        System.out.println(frog.solution(X, Y, D));
    }
}
