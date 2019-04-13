package String;

import java.util.Scanner;

public class scoreLevel {
    Scanner input = new Scanner(System.in);
    public void matchLevel(){
        System.out.print("请输入分数：");
        int score = input.nextInt();
            if (score > 90) {
                System.out.print("A级\n");
            } else if (score > 80) {
                System.out.println("B级\n");
            } else if (score > 70) {
                System.out.println("C级\n");
            } else if (score < 60) {
                System.out.println("D级\n");
            } else {
                System.out.println("E级\n");
            }
    }
    public static void main(String[] args) {
        scoreLevel scores = new scoreLevel();
        scores.matchLevel();
    }
}