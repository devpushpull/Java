package Array;

public class ArrayFR {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2};
        FindRepeatInArray(array);
    }
    public static void FindRepeatInArray(int[] a){
        int cont = 0;
        for (int j = 0; j < a.length; j++) {
            for (int k = j + 1; k < a.length; k++) {
                if (a[j] == a[k]) {
                    cont++;
                }
            }
            if (cont == 1)
                System.out.println("重复的元素为：" + a[j]);
            cont = 0;
        }
    }
}
