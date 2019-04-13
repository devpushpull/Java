package Method;

import java.util.ArrayList;
import java.util.Vector;

public class MethodInstance {
    public static void main(String[] args) {
        Object testObject = new ArrayList();
        displayObjectClass(testObject);
    }
    public static void displayObjectClass(Object o){
        if(o instanceof Vector)
            System.out.println("对象是 java.util.Vectour 类的实例");
        else if(o instanceof ArrayList)
            System.out.println("对象是 java.util.ArrayList 类的实例");
        else
            System.out.println("对象是"+o.getClass()+"类的实例");
    }
}
