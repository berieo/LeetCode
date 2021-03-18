//单例懒汉模式，线程安全
//public class Singleton {
//
//    //第一次不初始化，用的时候初始化
//    private static Singleton instance;
//
//    private Singleton(){}
//
//    public static synchronized Singleton getInstance(){
//        if(instance == null)
//            instance = new Singleton();
//        return instance;
//    }
//
//    public void showMessage(){
//        System.out.println("hello");
//    }
//
//}

//饿汉模式，在用的时候初始化
//public class Singleton{
//    private static Singleton instance = new Singleton();
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        return instance;
//    }
//
//    public void showMessage(){
//        System.out.println("hello");
//    }
//}

//双重检查懒汉式
public class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
