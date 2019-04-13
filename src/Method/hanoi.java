package Method;

import java.util.Scanner;

public class hanoi {
    //p1为初始盘子，p3为目标盘子
    public static void solve(int n,int p1,int p2,int p3){
        if(n==1){
            System.out.println("从"+p1+"移动到"+p3);
        }else{
            solve(n-1,p1,p3,p2);
            System.out.println("从"+p1+"移动到"+p3);
            solve(n-1,p2,p1,p3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入汉诺塔的层数：");
        int n = sc.nextInt();
        solve(n,1,2,3);
    }
}
