public class RectangleShape extends BaseShape {
    int w;
    int h;

    RectangleShape(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    double getArea() {
        return w * h;
    }
}
