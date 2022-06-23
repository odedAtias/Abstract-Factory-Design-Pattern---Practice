public class FactoryProducer {
    public AbstractFactory getFactory(boolean isRounded) {
        if (isRounded)
            return new RoundedShapeFactory();
        return new ShapeFactory();
    }
}
