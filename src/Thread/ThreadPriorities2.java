/*
以下实例演示了如何使用 getPriority() 方法获取线程优先级：
*/

package Thread;

public class ThreadPriorities2 extends Object {
    private static Runnable MakeRunnable(){
        Runnable r = new Runnable(){
            public void run(){
                for(int i=0;i<5;i++){
                    Thread t = Thread.currentThread();
                    System.out.println("in run - priority=" + t.getPriority() + ",name:" + t.getName());
                    try{
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException exc){

                    }
                }
            }
        };
        return r;
    }
    public static void main(String[] args){
        System.out.println("in main() -Thread.currentThread().getPriority()=" + Thread.currentThread().getPriority());
        System.out.println("in main() - Thread.currentThread().getName()=" + Thread.currentThread().getName());
        Thread threadA = new Thread(MakeRunnable(),"threadA");
        threadA.start();
        try{
            Thread.sleep(3000);
        }catch(InterruptedException exc){
        }
        System.out.println("in main() - ThreadA.getPriority()=" + threadA.getPriority());
    }
}
