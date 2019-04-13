package Array;

import java.util.*;

public class ArrayFill {
    public static void main(String[] args) {
        int array[] = new int[6];
        Arrays.fill(array,100);
        for (int i = 0; i < array.length; i++) {
            if(i!=0){
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
        System.out.println();
        Arrays.fill(array,2,4,50);
        for (int i = 0; i < array.length; i++) {
            if(i!=0){
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
    }
}
