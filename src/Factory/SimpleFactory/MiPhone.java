package Factory.SimpleFactory;

public class MiPhone implements Phone {
    public MiPhone(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make xiaomi phone!");
    }
}


