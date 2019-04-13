/*
以下实例演示了使用 Collection 类的 sort() 方法对向量进行排序并使用 binarySearch() 方法来获取向量元素的索引值：
*/

package DataStructure;

import java.util.Collections;
import java.util.Vector;

public class VectorGetIndex {
    public static void main(String[] args){
        Vector<String> v = new Vector<String>();
        v.add("X");
        v.add("M");
        v.add("D");
        v.add("A");
        v.add("O");
        Collections.sort(v);
        System.out.println("排序后的向量："+v);
        int index = Collections.binarySearch(v,"D");
        System.out.println("向量M的索引值："+index);
    }
}
