/*
以下实例演示了如何通过setPriority() 方法来设置线程的优先级：
*/

package Thread;

public class SimplePriorities extends Thread {
    private int contDown = 5;
    private volatile double d = 0;
    public SimplePriorities(int priority){
        setPriority(priority);
        start();
    }
    public String toString(){
        return super.toString() +":"+contDown;
    }
    public void run(){
        while(true){
            for(int i=0;i<100000;i++){
                d = d + (Math.PI+Math.E)/(double)i;
                System.out.println(this);
                if(--contDown ==0) return;
            }
        }
    }
    public static void main(String[] args){
        new SimplePriorities(Thread.MAX_PRIORITY);
        for(int i=0;i<5;i++){
            new SimplePriorities(Thread.MIN_PRIORITY);
        }
    }
}
