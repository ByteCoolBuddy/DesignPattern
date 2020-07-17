package Template;

public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
    }

    @Override
    boolean customerWantCandiments() {
        return false;
    }
}
