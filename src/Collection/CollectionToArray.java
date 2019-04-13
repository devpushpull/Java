package Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArray {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.runoob.com");
        String[] s1 = list.toArray(new String[0]);
        for(int i=0;i<s1.length;++i){
            String contents = s1[i];
            System.out.print(contents+" ");
        }
    }
}
