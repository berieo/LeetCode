//单例懒汉模式，不安全
public class SingleObject {

    //第一次不初始化，用的时候初始化
    private static SingleObject instance;

    //将构造函数private，这样不会被初始化
    private SingleObject(){
    }

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        if(instance == null){
            instance = new SingleObject();
        }
        return instance;
    }

    //内部函数
    public void showMessage(){
        System.out.println("hello");
    }

}
