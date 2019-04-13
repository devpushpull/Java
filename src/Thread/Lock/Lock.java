package Thread.Lock;

import java.util.Date;

public class Lock {
    public static String obj1 = "obj1";
    public static String obj2 = "obj2";
    public static void main(String[] args){
        LockA la = new LockA();
        new Thread(la).start();
        LockB lb = new LockB();
        new Thread(lb).start();
    }
}
class LockA implements Runnable{
    public void run(){
        try{
        System.out.println(new Date().toString()+" LockA 开始执行");
        while(true){
            synchronized (Lock.obj1){
                System.out.println(new Date().toString()+" LockA 锁定 obj1");
                Thread.sleep(3000);//此处等待是给B能锁住的机会
                synchronized (Lock.obj2){
                    System.out.println(new Date().toString()+" LockA 锁住 obj2");
                    Thread.sleep(60*1000);
                }
            }
        }
    }
    catch(Exception e){
            e.printStackTrace();
        }
    }
}
class LockB implements Runnable{
    public void run(){
        try{
            System.out.println(new Date().toString()+" LockB 开始执行");
            while(true){
                synchronized (Lock.obj2){
                    System.out.println(new Date().toString()+" LockB 锁定 obj2");
                    Thread.sleep(3000);//此处等待是为了给A锁住的机会
                    synchronized (Lock.obj1){
                        System.out.println(new Date().toString()+" LockB 锁住 obj1");
                        Thread.sleep(60*1000);
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
