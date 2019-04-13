package String;

public class StringReverse {
    public static void main(String[] args){
        String str = "world";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("反转前的结果:"+str);
        System.out.println("反转后的结果："+reverse);
    }
}
