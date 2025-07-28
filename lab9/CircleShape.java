public class CircleShape extends BaseShape {
    int r;

    CircleShape(int r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return 3.14159 * r * r;
    }
}
