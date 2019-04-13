package Exception;

public class ChainException {
    public static void main(String[] args) throws Exception{
        int n=20,result=0;
        try{
            result = n/0;
            System.out.println("计算结果为："+result);
        }
        catch(ArithmeticException e1){
            System.out.println("算术异常："+e1);
            try{
                throw new NumberFormatException();
            }catch(NumberFormatException e2){
                System.out.println("手动抛出链式异常："+e2);
            }
        }
    }
}
