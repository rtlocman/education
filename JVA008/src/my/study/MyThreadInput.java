package my.study;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by red2 on 20.05.2016.
 */
public class MyThreadInput {
    public static void main(String[] args) {
        System.out.println("MyThreadInput is started!");
    }
}

class FillArray{
    ArrayList<String> list;
    String fileName;

    public FillArray(int size,String fileName) {
        list = new ArrayList<String>(size);
        this.fileName = fileName;
    }
    public void fill(){
//        Thread save = new Thread(new AutoSave());
//        save.setDaemon(true);
//        save.start();
    }
    public void save() throws FileNotFoundException {
        OutputStreamWriter  outputStream = new OutputStreamWriter(new FileOutputStream(fileName));
    }
    class AutoSave implements Runnable{
        int waitingSeconds;

        public AutoSave(int waitingSeconds) {
            this.waitingSeconds = waitingSeconds*1000;
        }

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
            try {
                Thread.sleep(waitingSeconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}