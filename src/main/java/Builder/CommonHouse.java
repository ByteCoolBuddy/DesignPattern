package Builder;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("commonHouse buildBase!!! ");
    }

    @Override
    public void buildWall() {
        System.out.println("commonHouse buildWall!!! ");
    }

    @Override
    public void roofed() {
        System.out.println("commonHouse buildRoof!!! ");
    }
}
