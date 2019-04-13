/*
以下实例演示了如何使用 Hashtable 类的 keys() 方法来遍历输出键值：
*/

package Collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableTraverseKey {
    public static void main(String[] args){
        Hashtable ht = new Hashtable();
        ht.put(1,"One");
        ht.put(2,"Two");
        ht.put(3,"Three");
        Enumeration e = ht.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
