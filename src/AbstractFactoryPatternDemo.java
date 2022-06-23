public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //Step 1: Choose a factory of shapes that we want to create ׂׂׂby passing value in the boolean flag
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //Step 2: Choose a shape that we want to create by passing value in the getShape argument
        Shape triangle = shapeFactory.getShape("Triangle");
        //Step 3: call draw method of our triangle
        triangle.draw();

        //More Example
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");
        roundedRectangle.draw();
    }
}
