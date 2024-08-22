public class ShapeFactory {
    public Shape getShape(String shapeType){
        if("CIRCLE".equals(shapeType)){
            return new Circle();
        }
        else if("SQUARE".equals(shapeType)){
            return new Square();
        }
        else if("RECTANGLE".equals(shapeType)){
            return new Rectangle();
        }
        else
            System.out.println("Invalid shape type provided.");
            return null;

    }

}
