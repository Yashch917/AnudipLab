public class ShapeTest {
    public static void main(String[] args) {
        CircleShape circle = new CircleShape(5);
        SquareShape square = new SquareShape(4);
        RectangleShape rectangle = new RectangleShape(6, 3);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}
