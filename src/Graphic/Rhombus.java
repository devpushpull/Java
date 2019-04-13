package Graphic;

public class Rhombus {
    public static void main(String[] args) {
        pirintRhombus(8);
    }
    public static void pirintRhombus(int size){
        if(size%2==0){
            size++;
        }
        for (int i = 0; i < size/2+1; i++) {
            for (int j = size/2+1; j > i+1; j--) {
                System.out.print(" ");//输出左上角空白
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");//输出菱形上半部边缘
            }
            System.out.println();//换行
        }
        for (int i = size/2+1; i < size; i++) {
            for (int j = 0; j < i-size/2; j++) {
                System.out.print(" ");//输出右下部分空白
            }
            for (int j = 0; j < 2*size-1-2*i; j++) {
                System.out.print("*");//输出菱形下半部分
            }
            System.out.println();//换行
        }
    }
}
