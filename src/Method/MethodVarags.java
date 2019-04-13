package Method;

public class MethodVarags {
    static int sumvarargs(int... intArrays){
        int sum,i;
        sum = 0;
        for (i = 0; i < intArrays.length; i++) {
            sum += intArrays[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;
        sum = sumvarargs(new int[]{10,12,33});
        System.out.println("数字相加之和是："+sum);
    }
}
