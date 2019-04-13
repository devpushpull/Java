/*
Java中的线程的生命周期大体可分为5种状态。

1. 新建状态（New）：新创建了一个线程对象。
2. 就绪状态（Runnable）：线程对象创建后，其他线程调用了该对象的start()方法。该状态的线程位于可运行线程池中，变得可运行，等待获取CPU的使用权。
3. 运行状态（Running）：就绪状态的线程获取了CPU，执行程序代码。
4. 阻塞状态（Blocked）：阻塞状态是线程因为某种原因放弃CPU使用权，暂时停止运行。直到线程进入就绪状态，才有机会转到运行状态。阻塞的情况分三种：
（一）、等待阻塞：运行的线程执行wait()方法，JVM会把该线程放入等待池中。
（二）、同步阻塞：运行的线程在获取对象的同步锁时，若该同步锁被别的线程占用，则JVM会把该线程放入锁池中。
（三）、其他阻塞：运行的线程执行sleep()或join()方法，或者发出了I/O请求时，JVM会把该线程置为阻塞状态。当sleep()状态超时、join()等待线程终止或者超时、或者I/O处理完毕时，线程重新转入就绪状态。
5. 死亡状态（Dead）：线程执行完了或者因异常退出了run()方法，该线程结束生命周期。
*/

/*
以下实例演示了如何获取线程的状态：
*/

package Thread;

class MyThread2 extends Thread{
    boolean waiting = true;
    boolean ready = false;
    MyThread2(){
    }
    public void run(){
        String thrdName = Thread.currentThread().getName();
        System.out.println(thrdName + " 启动");
        while(waiting)
            System.out.println("等待： "+waiting);
        System.out.println("等待...");
        startWait();
        try{
            Thread.sleep(1000);
        }
        catch(Exception exc){
            System.out.println(thrdName + "中断");
        }
        System.out.println(thrdName + "结束");
    }
    synchronized void startWait(){
        try{
            while(!ready) wait();
        }
        catch(InterruptedException exc){
            System.out.println("wait() 中断");
        }
    }
    synchronized void notice(){
        ready = true;
        notify();
    }
}

public class ThreadStatus2 {
    public static void main(String[] args) throws Exception{
        MyThread2 thrd = new MyThread2();
        thrd.setName("MyThread #1");
        showThreadStatus2(thrd);
        thrd.start();
        Thread.sleep(50);
        showThreadStatus2(thrd);
        thrd.waiting = false;
        Thread.sleep(50);
        showThreadStatus2(thrd);
        thrd.notice();
        thrd.sleep(50);
        showThreadStatus2(thrd);
        while(thrd.isAlive()){
            System.out.println("alive");
        }
        showThreadStatus2(thrd);
    }
    static void showThreadStatus2(Thread thrd){
        System.out.println(thrd.getName() + " 存活：" + thrd.isAlive() + " 状态：" + thrd.getState());
    }
}
