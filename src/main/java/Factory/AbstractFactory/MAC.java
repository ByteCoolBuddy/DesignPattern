package Factory.AbstractFactory;

public class MAC implements PC {
    @Override
    public void make() {
        System.out.println("make MAC!");
    }

    public MAC(){
        this.make();
    }
}
