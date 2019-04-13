package Array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMaxMin {
    public static void main(String[] args){
        Integer [] myarray = {8,2,7,1,4,9,5};
        int min = (int)Collections.min(Arrays.asList(myarray));
        int max = (int)Collections.max(Arrays.asList(myarray));
        System.out.println("数组中的最小值："+min);
        System.out.println("数组中的最大值："+max);
    }
}
