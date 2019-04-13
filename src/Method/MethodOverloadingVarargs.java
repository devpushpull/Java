package Method;

public class MethodOverloadingVarargs {
    static void vaTest(int... n){
        System.out.println("vaTest(int...)："+"参数个数："+n.length+" "+"内容：");
        for (int result:n) {
            System.out.print(result+" ");
        }
        System.out.println();
    }
    static void vaTest(boolean... bl){
        System.out.println("vaTest(boolean...)："+"参数个数："+bl.length+" "+"内容：");
        for (boolean result:bl) {
            System.out.print(result+" ");
        }
        System.out.println();
    }
    static void vaTest(String msg,int... n){
        System.out.println("vaTest(String...)：" + msg+ "参数个数："+n.length+" "+"内容：");
        for (int result:n) {
            System.out.print(result+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("测试：",10,20);
        vaTest(true,false,false);
    }
}
