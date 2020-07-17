package singleton.type1;


/*
饿汉式（静态变量）单例模式

 */
public class SingletonTest01 {
    public static void main(String[] args) {
        //1.不能new
        //Singleton instance1=new Singleton();
        Singleton instance1=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println("instance1 HashCode:"+instance1.hashCode());
        System.out.println("instance2 HashCode:"+instance2.hashCode());

    }
}
class Singleton{
    //1.构造器私有化，防止外部可以new
    private Singleton(){

    }
    //2. 本类里创建实例
    private final static Singleton instance=new Singleton();
    //3. 提供一个公有的静态方法，返回实例对象。

    public static Singleton getInstance(){
        return instance;
    }
}
