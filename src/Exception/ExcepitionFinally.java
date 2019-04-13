package Exception;

public class ExcepitionFinally {
    public static void main(String[] args){
        new ExcepitionFinally().doTheWork();
    }
    public void doTheWork(){
        Object o = null;
        for (int i = 0; i < 5; i++) {
            try{
                o = makeObj(i);
            }catch(IllegalArgumentException e){
                System.err.println("Eorr:("+e.getMessage()+").");
                return;
            }
            finally{
                System.out.println("都已执行完毕");
                if(o == null)
                    System.exit(0);
            }
            System.out.println(o);
        }
    }
    public Object makeObj(int tpye) throws IllegalArgumentException{
        if(tpye == 1)
            throw new IllegalArgumentException("不是指定的类型："+tpye);
        return new Object();
    }
}
