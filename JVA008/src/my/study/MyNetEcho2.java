package my.study;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

/**
 * Created by red2 on 20.05.2016.
 */
public class MyNetEcho2 {
    List<MySession> sessionList;
//    LinkedList<MySession> sessionList;
    ServerSocket serverSocket;

    public MyNetEcho2() throws IOException {
        sessionList = new LinkedList<MySession>();
//        sessionList = new LinkedList<MySession>();
        serverSocket = new ServerSocket(3000);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("MyNetEcho with 2 threads  started");
        MyNetEcho2 netEcho = new MyNetEcho2();
        Thread regJobs = new Thread(netEcho.new RegJob(netEcho.sessionList));
        Thread runner = new Thread(netEcho.new Runner(netEcho.sessionList));
//        regJobs.setDaemon(true);
        regJobs.start();
        runner.start();

        }
    class RegJob implements Runnable{
        final List<MySession> sessionList;

        RegJob(List<MySession> sessionList) {
            this.sessionList = sessionList;//Collections.synchronizedList(sessionList);
        }

        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }

                try {
                    synchronized (sessionList){
                        sessionList.add(new MySession(serverSocket.accept()));
                    }
                    System.out.println("in session list: "+sessionList.size());
                } catch (IOException e) {
//                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }

            }
        }
    }
    class Runner implements  Runnable{
        List<MySession> sessionList;

        Runner(List<MySession> sessionList) {
            this.sessionList = sessionList; //Collections.synchronizedList(sessionList);
        }

        @Override
        public void run() {
            while(true){
//                synchronized (sessionList){
                for(MySession sess: sessionList){
//                for(Iterator<MySession> sesionIterator = sessionList.iterator(); sesionIterator.hasNext();){
//                    MySession sess = sesionIterator.next();
                    try {
                        sess.step();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
//                        if(sess.step()<0){
//                            sessionList.remove(sess);
//                        }
                }
//                }

            }
        }
    }
    }

    class MySession{
        Socket socket;
        BufferedWriter bufferedWriter;
        BufferedReader bufferedReader;

        MySession(Socket socket) throws IOException {
            this.socket = socket;
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Connected "+socket.getInetAddress().toString());
            bufferedWriter.write("Hello world");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        public int step() throws IOException {
            int result = 0;

            System.out.print(".");
            if(bufferedReader.ready()){

                String mes = bufferedReader.readLine();
                if(mes.equals("quit")){
                    result--;
                    System.out.print("I'm ready for quit");
                }
                System.out.print(" >"+mes);
                bufferedWriter.write(mes);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            return result;
        }
    }

