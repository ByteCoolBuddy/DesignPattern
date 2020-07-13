package singleton.type6;

/*
双重检查 推荐使用
 */

public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton instance1= Singleton.getInstance();
        Singleton instance2= Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println("instance1 HashCode:"+instance1.hashCode());
        System.out.println("instance2 HashCode:"+instance2.hashCode());

    }
}


class  Singleton {
    private static volatile Singleton instance;

    private Singleton(){

    }
    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //并且加入了双重检查的代码 解决了线程安全问题 懒加载问题
    //保证了效率
    public static  Singleton getInstance(){

        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }
}