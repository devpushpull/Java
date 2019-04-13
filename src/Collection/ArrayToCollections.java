package Collection;

import java.util.*;

public class ArrayToCollections {
    public static void main(String[] args) throws Exception{
        int n = 5;
        String[] arry = new String[n];
        for (int i = 0; i < 5; i++) {
            arry[i] = String.valueOf(i);
        }
        List<String> list = Arrays.asList(arry);
        System.out.println();
        for (String li:list) {
            String str = li;
            System.out.print(str+" ");
        }
    }
}
