package random;

public class Test {
    public static void main(String[] args) {
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        System.out.println("RectOne w:" + rectOne.w);
        System.out.println("RectOne h:" + rectOne.h);


        rectTwo.origin = originOne;

        System.out.println(originOne);
        System.out.println(rectOne.origin);
        System.out.println(rectTwo.origin);

        originOne = null;

        System.out.println(originOne);
        System.out.println(rectOne.origin);
        System.out.println(rectTwo.origin);

        System.out.println("batatX: " + rectTwo.origin.x);


        Point pt1, pt2;
        pt1 = new Point(100, 100);
        pt2 = pt1;

        pt1.x = 200;
        pt1.y = 200;

        System.out.println("Point1: " + pt1 + " ::" + pt1.x + ", " + pt1.y);
        System.out.println("Point2: " + pt2 + " ::" + pt2.x + ", " + pt2.y);

        rectOne.origin = pt1;

        pt2 = null;
        System.out.println("RectOne " + rectOne.origin);
        System.out.println("pt1: " + pt1);
        System.out.println("pt2: " + pt2);
    }
}
