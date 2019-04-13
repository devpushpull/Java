package String;

public class SearchlastString {
    public static void main(String[] args){
        String str = "hello world";
        int lastindex = str.lastIndexOf("z");
        if(lastindex==-1){
            System.out.println("未找到指定的字符串");
        }else{
            System.out.println("指定字符串最后出现的位置是："+lastindex);
        }
    }
}
