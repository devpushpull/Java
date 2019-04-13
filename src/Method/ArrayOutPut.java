package Method;

public class ArrayOutPut {
    public static void printArray(Integer[] inputArray){
        for (Integer element:inputArray) {
            System.out.printf("%s",element);
            System.out.println();
        }        
    }
    public static void printArray(Double[] inputArray){
        for (Double element:inputArray) {
            System.out.printf("%s",element);
            System.out.println();
        }
    }
    public static void printArray(Character[] inputArray){
        for (Character element:inputArray) {
            System.out.printf("%s",element);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3};
        Character[] characterArray = {'H','E','L','L','O'};
        System.out.println("输出整形数组：");
        printArray(integerArray);
        System.out.println("输出双精度浮点型数组：");
        printArray(doubleArray);
        System.out.println("输出字符型数组：");
        printArray(characterArray);
    }
}
