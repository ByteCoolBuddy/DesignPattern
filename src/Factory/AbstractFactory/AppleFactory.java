package Factory.AbstractFactory;

public class AppleFactory implements AbstrcatFactory {
    @Override
    public PC makePC() {
        return new MAC();
    }

    @Override
    public Phone makePhone() {
        return new IPhone();

    }
}
