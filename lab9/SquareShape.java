public class SquareShape extends BaseShape {
    int side;

    // Constructor
    SquareShape(int side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }
}
