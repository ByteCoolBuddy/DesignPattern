package Factory.FactoryMethod;

public class AppleFactory implements AbstrcatFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
}
