package Builder;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("HighBuilding buildBase!!! ");
    }

    @Override
    public void buildWall() {
        System.out.println("HighBuilding buildWall!!! ");
    }

    @Override
    public void roofed() {
        System.out.println("HighBuilding buildRoof!!! ");
    }
}
