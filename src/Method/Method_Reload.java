package Method;

public class Method_Reload {
    public static void main(String[] args) {
        MyClass t= new MyClass(3);
        t.info();
        t.info("重载方法");
        //重载构造方法
        new MyClass();
    }
}
class MyClass{
    int height;
    MyClass(){
        System.out.println("无参构造函数");
        height = 4;
    }
    MyClass(int i){
        System.out.println("房子高度"+i+"米");
        height = i;
    }
    void info(){
        System.out.println("房子高度"+height+"米");
    }
    void info(String s){
        System.out.println("房子高度"+height+"米");
    }
}
