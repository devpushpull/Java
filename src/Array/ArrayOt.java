package Array;

public class ArrayOt {
    public static void main(String[] args){
        String[] array = new String[3];
        array[0] = "你吃饭了吗？";
        array[1] = "我吃过了，你呢？";
        array[2] = "我也吃过了。";
        for(int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }
}
