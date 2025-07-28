public class Rectangle extends Shape {
    double w;
    double h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    double calculateArea() {
        return w * h;
    }
}
