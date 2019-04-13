package Method;

public class MethodBreak {
    public static void main(String[] args) {
        int[] intary = {99,12,22,34,45,67,5678,8990};
        int n = 22;
        int i = 0;
        boolean found = false;
        for (; i < intary.length; i++) {
            if(intary[i] == n){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("元素在数组的"+i+"个位置");
        }else{
            System.out.println("元素不在数组中");
        }
    }
}
