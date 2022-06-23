public class FactoryProducer {
    public static AbstractFactory getFactory(boolean isRounded) {
        if (isRounded)
            return new RoundedShapeFactory();
        return new ShapeFactory();
    }
}
