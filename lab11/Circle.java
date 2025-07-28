class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double calculateArea() {
        return 3.14159 * r * r;
    }
}
