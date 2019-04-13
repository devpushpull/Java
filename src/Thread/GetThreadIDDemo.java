/*
以下实例演示了如何使用 getThreadId() 方法获取线程id：
*/

package Thread;

public class GetThreadIDDemo extends Object implements Runnable {
    private ThreadID var;

    public GetThreadIDDemo(ThreadID v){
        this.var = v;
    }
    public void run(){
        try{
            print("var getThreadID = "+var.getThreadID());
            Thread.sleep(2000);
            print("var getThreadID = "+var.getThreadID());
        }
        catch(InterruptedException exc){
        }
    }
    private static void print(String msg){
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }
    public static void main(String[] args){
        ThreadID tid = new ThreadID();
        GetThreadIDDemo shared = new GetThreadIDDemo(tid);
        try{
            Thread threadA = new Thread(shared,"threadA");
            threadA.start();
            Thread.sleep(500);
            Thread threadB = new Thread(shared,"threadB");
            threadB.start();
            Thread.sleep(500);
            Thread threadC = new Thread(shared,"threadC");
            threadC.start();
        }
        catch(InterruptedException Exc){
        }
    }
}
class ThreadID extends ThreadLocal{
    private int nextID;

    public ThreadID(){
        nextID = 10001;
    }
    private synchronized Integer getNewID(){
        Integer id = new Integer(nextID);
        nextID++;
        return id;
    }
    protected Object initialValue(){
        print("in initialValue()");
        return getNewID();
    }
    public int getThreadID(){
        Integer id = (Integer) get();
        return id.intValue();
    }
    private static void print(String msg){
        String name = Thread.currentThread().getName();
        System.out.println(name+": "+msg);
    }
}
