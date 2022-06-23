public class ShapeFactory extends AbstractFactory{
    protected Shape getShape(String shape){
        if(shape.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        if(shape.equalsIgnoreCase("TRIANGLE"))
            return new Trinagle();
        return null;
    }
}
