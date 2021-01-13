public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeType.Circle);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeType.Square);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(ShapeType.Rectangle);
        shape3.draw();

    }
}
