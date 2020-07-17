package Factory.AbstractFactory;

public class Demo {
    public static void main(String[] args) {
        AbstrcatFactory miFactory=new XiaoMiFactory();
        AbstrcatFactory appleFactory=new AppleFactory();
        miFactory.makePhone();
        appleFactory.makePhone();
        miFactory.makePC();
        appleFactory.makePC();

    }
}
