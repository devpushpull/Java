package Array;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) throws Exception {
        int[] ary = {1,2,3,4,5,6};
        int[] ary1 ={1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};
        System.out.println("数组ary是否与ary1相等？："+ Arrays.equals(ary,ary1));
        System.out.println("数组ary是否与ary2相等？："+Arrays.equals(ary,ary2));
    }
}
