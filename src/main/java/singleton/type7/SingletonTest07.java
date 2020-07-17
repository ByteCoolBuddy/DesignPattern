package singleton.type7;

/*
静态内部类 推荐使用
 */

public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("静态内部类");
        Singleton instance1= Singleton.getInstance();
        Singleton instance2= Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println("instance1 HashCode:"+instance1.hashCode());
        System.out.println("instance2 HashCode:"+instance2.hashCode());

    }
}


class  Singleton {
    //构造器私有化
    private  Singleton(){

    }
    //静态内部类  有一个静态属性Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }
    //提供一个静态 公有方法  直接返回INSTANCE
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}