package Factory.SimpleFactory;

public class IPhone implements Phone {
    @Override
    public void make() {
        System.out.println("make iphone!");
    }

    public IPhone(){
        this.make();
    }
}
