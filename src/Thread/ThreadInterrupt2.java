/*
以下实例演示了如何使用interrupt()方法来中断线程并使用 isInterrupted() 方法来判断线程是否已中断：
*/

package Thread;

public class ThreadInterrupt2 extends Object implements Runnable {
    public void run(){
        try{
            System.out.println("in run() - 将运行 work2() 方法");
            work2();
            System.out.println("in run() - 从 work2() 方法回来");
        }catch(InterruptedException exc){
            System.out.println("in run() - 中断 work2() 方法");
            return;
        }
        System.out.println("休眠后执行");
        System.out.println("正常离开");
    }
    public void work2() throws InterruptedException{
        while(true){
            if(Thread.currentThread().isInterrupted()) {
                System.out.println("C isInterrupted=" + Thread.currentThread().isInterrupted());
                Thread.sleep(2000);
                System.out.println("D isInterrupted=" + Thread.currentThread().isInterrupted());
            }
        }
    }
    public void work() throws InterruptedException{
        while(true){
            for(int i=0;i<100000;i++){
                int j = i*2;
            }
            System.out.println("A isInterrupted()=" + Thread.currentThread().isInterrupted());
            if(Thread.interrupted()){
                System.out.println("B isInterrupted()=" + Thread.currentThread().isInterrupted());
                throw new InterruptedException();
            }
        }
    }
    public static void main(String[] args){
        ThreadInterrupt2 ti2 = new ThreadInterrupt2();
        Thread thrd = new Thread(ti2);
        thrd.start();
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
        }
        System.out.println("in main() - 中断其他线程");
        thrd.interrupt();
        System.out.println("in main() - 离开");
    }
}
