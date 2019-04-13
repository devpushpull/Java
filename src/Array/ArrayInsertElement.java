package Array;

import java.util.Arrays;

public class ArrayInsertElement {
    public static void main(String args[]) throws Exception{
        int array[] = {2,5,-2,6,-3,8,0,-7,-9,4};
        Arrays.sort(array);
        printArray("排序后的数组为",array);
        int index = Arrays.binarySearch(array,1);
        System.out.println("元素1在数组中第"+index+"个位置");
        int newIndex = -index-1;
        array = insertElement(array,1,newIndex);
        printArray("数组添加元素1后的新数组为",array);
        int newIndex2 = Arrays.binarySearch(array,1);
        System.out.println("元素1在新数组中第"+newIndex2+"个位置");
    }
    private static void printArray(String message,int array[]){
        System.out.println(message+"：[length:"+array.length+"]");
        for(int i = 0;i<array.length;i++){
            if(i!=0) {
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
    private static int[] insertElement(int ori[],int ele,int index){
        int length = ori.length;
        int des[] = new int[length+1];
        System.arraycopy(ori,0,des,0,index);
        des[index] = ele;
        System.arraycopy(ori,index,des,index+1,length-index);
        return des;
    }
}
