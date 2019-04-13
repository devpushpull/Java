package String;

public class StringSplit {
    public static void main(String[] args){
        String str = "www-oracle-com";
        String[] temp;
        String flag = "-";
        temp = str.split("-");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(" "+temp[i]);
        }
    }
}
