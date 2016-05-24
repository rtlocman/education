package my.study;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by red2 on 20.05.2016.
 */
public class MyNetEcho2 {
    List<MySession> sessionList;
    //    LinkedList<MySession> sessionList;
    ServerSocket serverSocket;

    public MyNetEcho2() throws IOException {
        sessionList = new CopyOnWriteArrayList<MySession>();
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

    class RegJob implements Runnable {
        final List<MySession> sessionList;

        RegJob(List<MySession> sessionList) {
            this.sessionList = sessionList;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    sessionList.add(new MySession(serverSocket.accept()));
                    System.out.println("in session list: " + sessionList.size());
                } catch (IOException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        }
    }

    class Runner implements Runnable {
        List<MySession> sessionList;

        Runner(List<MySession> sessionList) {
            this.sessionList = sessionList; //Collections.synchronizedList(sessionList);
        }

        @Override
        public void run() {
            while (true) {
                Iterator<MySession> sesionIterator = sessionList.iterator();
                while (sesionIterator.hasNext()) {
                    MySession sess = sesionIterator.next();
                    try {
                        sess.step();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class MySession {
    BufferedWriter bufferedWriter;
    BufferedReader bufferedReader;

    MySession(Socket socket) throws IOException {
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Connected " + socket.getInetAddress().toString());
        bufferedWriter.write("Hello world");
        bufferedWriter.newLine();
        bufferedWriter.flush();
    }

    public int step() throws IOException {
        int result = 0;

        if (bufferedReader.ready()) {

            String mes = bufferedReader.readLine();
            if ("quit".equals(mes)) {
                result--;
                System.out.print("I'm ready for quit");
            }
            bufferedWriter.write(mes);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.print(" >" + mes);
        }
        return result;
    }
}

