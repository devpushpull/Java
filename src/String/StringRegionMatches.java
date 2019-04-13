package String;

public class StringRegionMatches {
    public static void main(String[] args){
        String str1 = "Welcome to Microsoft";
        String str2 = "I work with microsoft";
        System.out.println("-----区分大小写比较-----");
        boolean match1 = str1.regionMatches(11,str2,12,9);
        System.out.println("-----忽略大小写比较-----");
        boolean match2 = str1.regionMatches(true,11,str2,12,9);
        System.out.println("区分大小写返回值："+match1);
        System.out.println("忽略大小写返回值："+match2);
    }
}
