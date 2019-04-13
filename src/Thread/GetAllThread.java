/*
以下实例演示了如何使用 getName() 方法获取所有正在运行的线程：
*/

package Thread;

public class GetAllThread extends Thread {
    public static void main(String[] args){
        GetAllThread thrd = new GetAllThread();
        thrd.setName("thread1");
        thrd.start();
        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int noThreads = currentGroup.activeCount();
        Thread[] lstThread = new Thread[noThreads];
        currentGroup.enumerate(lstThread);
        for(int i=0;i<lstThread.length;i++){
            System.out.println("线程号：" + i + " " + lstThread[i].getName());
        }
    }
}
