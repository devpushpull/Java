package Array;

public class ArrayExtend {
    public static void main(String[] args) {
        String[] array1 = new String[]{"A","B","C"};
        String[] array2 = new String[5];
        array2[3] = "D";
        array2[4] = "E";
        System.arraycopy(array1,0,array2,0,array1.length);
        for (String str:array2) {
            System.out.println(str);
        }
    }
}
