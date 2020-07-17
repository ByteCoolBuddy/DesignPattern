package Builder;

public class Demo {
    public static void main(String[] args) {

        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        houseDirector.construct();
    //重置建造者
        houseDirector.setHouseBuilder(new HighBuilding());
        houseDirector.construct();
    }
}
