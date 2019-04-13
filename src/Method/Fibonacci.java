package Method;

import java.sql.SQLOutput;

public class Fibonacci {
    public static long solve(long number){
        if(number==0||number==1) {
            return number;
        }else{
            return solve(number-1)+solve(number-2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++) {
            System.out.printf("Fibonacci of %d is:%d\n",i,solve(i));
        }
    }
}
