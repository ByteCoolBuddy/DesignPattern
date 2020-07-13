package singleton.type4;

/*
懒汉式 线程安全 同步方法
 */

public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("懒汉式2 线程安全");
        Singleton instance1= Singleton.getInstance();
        Singleton instance2= Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println("instance1 HashCode:"+instance1.hashCode());
        System.out.println("instance2 HashCode:"+instance2.hashCode());

    }
}


class  Singleton {
    private static Singleton instance;

    private Singleton(){

    }
    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //并且加入了同步处理的代码 解决了线程安全问题
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}