package Method;

public class MethodForForeach {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        forDisplay(array);
        foreachDisplay(array);
    }
    public static void forDisplay(int[] array1){
        System.out.println("for循环遍历数组：");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();
    }
    public static void foreachDisplay(int[] array2){
        System.out.println("foreach遍历数组：");
        for (int result:array2) {
            System.out.print(result+" ");
        }
    }
}
