public class RoundedShapeFactory extends AbstractFactory {
        protected Shape getShape(String shape){
            if(shape.equalsIgnoreCase("RECTANGLE"))
                return new RoundedRectangle();
            if(shape.equalsIgnoreCase("TRIANGLE"))
                return new RoundedTriangle();
            return null;
        }
    }

