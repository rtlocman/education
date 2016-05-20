package my.study;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

/**
 * Created by red2 on 20.05.2016.
 */
public class MyNetEcho2 {
        LinkedList<MySession> sessionList;

    public MyNetEcho2() {
        sessionList = new LinkedList<MySession>();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("MyNetEcho with 2 threads  started");
        MyNetEcho2 netEcho = new MyNetEcho2();

        ServerSocket serverSocket = new ServerSocket(3000);

//            Thread task1 = new Thread(new MyEcho1(serverSocket));
//            Thread task2 = new Thread(new MyEcho1(serverSocket));
//            task1.start();
//            task2.start();
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

            bufferedWriter.write("Hello world");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        public int step() throws IOException {
            int result = 0;
            if(bufferedReader.ready()){
                String mes = bufferedReader.readLine();
                if(mes.equals("quit")){
                    result--;
                }
                bufferedWriter.write(mes);
            }
            return result;
        }
    }

