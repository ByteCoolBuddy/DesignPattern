package Builder;
//抽象建造者

public abstract class HouseBuilder {
    protected House house=new House();

    //将建造的流程写好，由子类继承。
    public abstract void buildBase();
    public abstract void buildWall();
    public abstract void roofed();

    //建造房子
    //建造完成，将房子返回。
    public House buildHouse(){
        return house;
    }
}
