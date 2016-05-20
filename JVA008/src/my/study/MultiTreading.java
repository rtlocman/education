package my.study;

import java.util.Timer;

/**
 * Created by red2 on 20.05.2016.
 */
public class MultiTreading {
    public static void main(String[] args) {
        System.out.println("Test");
//        while (true) {
//        }
//        MyTaskThread taskThread = new MyTaskThread();
//        taskThread.start();
//        MyTaskThread taskThread1 = new MyTaskThread();
//        taskThread1.start();
//        MyTaskThread taskThread3 = new MyTaskThread();
//        taskThread3.start();
//        System.out.println("End of job");
//
//        System.out.println("----------------------------");
//        Thread thread = new Thread((new MyTaskRunnible()));
//        Thread thread1 = new Thread((new MyTaskRunnible()));
//        Thread thread2 = new Thread((new MyTaskRunnible()));
//
//        thread.start();
//        thread1.start();
//        thread2.start();

        Thread timer1 = new Thread(new MyTimer(10,"First timer"));
        Thread timer2 = new Thread(new MyTimer(20,"Second timer"));
        Thread timer3 = new Thread(new MyTimer(30,"Third timer"));
        timer1.start();
        timer2.start();
        timer3.start();
        System.out.println("Main thread is over");
    }
}

class MyTaskThread extends  Thread{
    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p/>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        super.run();
        for(int i = 0 ; i<5; i++){
            Thread thread = Thread.currentThread();
            System.out.println(thread);
        }
    }
}

class MyTaskRunnible implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

    }
}

class MyTimer implements Runnable{
    Timer timer;
    int counts;
    String timerName;

    public MyTimer(int counts, String timerName) {
        this.counts = counts;
        this.timerName = timerName;
    }

    @Override
    public void run() {
        while(counts-->0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(timerName+" : "+ counts);
        }
        System.out.println(timerName + " work is over!");
    }
}