package Factory.FactoryMethod;

public class XiaoMiFactory implements AbstrcatFactory{
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}
