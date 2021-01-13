public class ShapeFactory {
    public Shape getShape(ShapeType shapeType){
        switch (shapeType){
            case Circle:
                return new Circle();
            case Square:
                return new Square();
            case Rectangle:
                return new Rectangle();
        }
        return null;
    }
}
