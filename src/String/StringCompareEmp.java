package String;

public class StringCompareEmp {
    public static void main(String[] args){
        String str1 = "Hello World";
        String str2 = "hello world";
        Object objstr = str1;
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.compareTo(objstr.toString()));
    }
}
