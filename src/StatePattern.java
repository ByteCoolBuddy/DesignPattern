public class StatePattern {
    public static void main(String[] args) {
        Context zhangsan=new Context();
        zhangsan.changeState(new Happy());
        zhangsan.doSomething();
        zhangsan.changeState(new Angry());
        zhangsan.doSomething();
    }


}

abstract class State{
    abstract void doWork();
}

class Happy extends State{
    @Override
    void doWork() {
        System.out.println("Happy Work！！！");
    }
}
class Angry extends State{
    @Override
    void doWork() {
        System.out.println("Angry Work!!!");
    }
}
class Sad extends State{
    @Override
    void doWork() {
        System.out.println("Sad Work!!!");
    }
}
class Context{
    private State state;
    Context(){
        state=null;
    }
    public void changeState(State state){
        this.state=state;
    }
    public void doSomething(){
        state.doWork();
    }
}