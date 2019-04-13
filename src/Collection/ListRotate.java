package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListRotate {
    public static void main(String[] args){
        List list = Arrays.asList("one two three four five siex".split(" "));
        System.out.println("list:"+list);
        Collections.rotate(list,3);
        System.out.println("list:"+list);
    }
}
