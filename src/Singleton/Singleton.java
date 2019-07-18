package Singleton;

public class Singleton {

    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    {
        System.out.println("创建单例");
    }

    public static Singleton getInstance(){
        return singleton;
    }

}
