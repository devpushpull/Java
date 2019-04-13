package String;

public class StringOptimization {
    public static void main(String[] args){
        String str[] = new String[50000];
        for (int i = 0; i < 50000; i++) {
            str[i] = "s"+i;
        }
        long startTime0 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            str[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("直接使用字符串的："+(endTime0-startTime0)+"ms");
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            str[i] = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("使用new关键字："+(endTime1-startTime1)+"ms");
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            str[i] = new String("hello");
            str[i] = str[i].intern();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("使用字符串对象的intern()方法："+(endTime2-startTime2)+"ms");
    }
}
