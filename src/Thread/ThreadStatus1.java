/*
以下实例演示了如何通过继承 Thread 类并使用 currentThread.getName() 方法来监测线程的状态：
*/

package Thread;

class MyThread1 extends Thread{
    boolean waiting = true;
    boolean ready = false;
    MyThread1(){
    }
    public void run(){
        String thrdName = Thread.currentThread().getName();
        System.out.println(thrdName+" starting.");
        while(waiting)
            System.out.println("waiting:"+waiting);
            System.out.println("waiting...");
        startWait();
        try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(thrdName+" interrupted.");
            }
            System.out.println(thrdName+" terminating.");
    }
    synchronized void startWait(){
        try{
            while(!ready) wait();
        }
        catch(InterruptedException e){
            System.out.println("wait() interrupted");
        }
    }
    synchronized void notice(){
        ready = true;
        notify();
    }
}
public class ThreadStatus1 {
    public static void main(String[] args) throws Exception{
        MyThread1 thrd = new MyThread1();
        thrd.setName("MyThread1 #1");
        showThreadStatus(thrd);
        thrd.start();
        Thread.sleep(50);
        showThreadStatus(thrd);
        thrd.waiting = false;
        Thread.sleep(50);
        showThreadStatus(thrd);
        thrd.notice();
        Thread.sleep(50);
        showThreadStatus(thrd);
        while(thrd.isAlive()){
            System.out.println("alive");
            showThreadStatus(thrd);
        }
    }
    static void showThreadStatus(Thread thrd){
        System.out.println(thrd.getName()+": Alive:"+thrd.isAlive()+" status:"+thrd.getState());
    }
}
