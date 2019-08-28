package random;

public class Rectangle {
    Point origin;
    int w;
    int h;

    public Rectangle(Point origin, int w, int h) {
        this.origin = origin;
        this.w = w;
        this.h = h;
    }

    public Rectangle(int w, int h) {
        this.origin = new Point(0, 0);
        this.w = w;
        this.h = h;
    }
}
