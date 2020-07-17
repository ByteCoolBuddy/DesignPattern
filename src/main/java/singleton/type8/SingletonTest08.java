package singleton.type8;



public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1==instance2);
        System.out.println("instance1 HashCode:"+instance1.hashCode());
        System.out.println("instance2 HashCode:"+instance2.hashCode());


    }
}

//使用枚举 可以实现单例 推荐


class Singleton{
    private Singleton(){

    }
    enum SingletonEnum{
        INSTANCE; //属性
        private final Singleton instance;
        SingletonEnum(){
            instance=new Singleton();
        }
        private Singleton getInstance(){
            return instance;
        }
    }
    public static Singleton getInstance(){
        return SingletonEnum.INSTANCE.getInstance();

    }
}