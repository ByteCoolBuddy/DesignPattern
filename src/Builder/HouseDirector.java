package Builder;

//指挥者 指定制作流程。
public class HouseDirector {
    HouseBuilder houseBuilder = null;
    //构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }

    //通过setter传入houseBuilder

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }


    //将如何处理房子的流程，交给指挥者。
    public House construct(){
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
