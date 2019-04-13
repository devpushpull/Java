package Array;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) throws Exception {
        int array[] = {2,5,-2,6,-3,8,0,-7,-9,4};
        Arrays.sort(array);
        printArrays("排序后的数组为：",array);
        int index = Arrays.binarySearch(array,2);
        System.out.println("数字2在数组中的第"+index+"个位置");
    }
    private static void printArrays(String message,int array[]){
        System.out.println(message+":[length:"+array.length+"]");
        for(int i = 0;i < array.length;i++){
            if(i!=0){
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
