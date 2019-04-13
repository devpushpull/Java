package Method;

public class MethodFactorial {
    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++) {
            System.out.printf("%d! = %d\n",i,factorial(i));
        }
    }
    public static long factorial(long n){
        if(n<=1)
            return n;
        else{
            return n*factorial(n-1);
        }
    }
}
