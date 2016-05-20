import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by red2 on 20.05.2016.
 */
public class MyNetEcho2 {


        public static void main(String[] args) throws IOException {
            System.out.println("MyNetworkEcho started");



            ServerSocket serverSocket = new ServerSocket(3000);
//        MyNetworkEcho echo = new MyNetworkEcho();
            Thread task1 = new Thread(new MyEcho(serverSocket));
            Thread task2 = new Thread(new MyEcho(serverSocket));
            task1.start();
            task2.start();
        }

    }

    class  MyEcho implements Runnable{
        ServerSocket serverSocket;

        public MyEcho(ServerSocket serverSocket) {
            this.serverSocket = serverSocket;
        }

        @Override
        public void run() {

            while (true) {
                try {
                    Socket socket = serverSocket.accept();
                    OutputStream outputStream = socket.getOutputStream();
                    InputStream inputStream = socket.getInputStream();

                    BufferedWriter bufferedWriter = new BufferedWriter(
                            new OutputStreamWriter(outputStream));

                    BufferedReader bufferedReader = new BufferedReader(
                            new InputStreamReader(inputStream)
                    );

                    bufferedWriter.write("Hello world");
                    bufferedWriter.flush();
                    bufferedWriter.write(bufferedReader.readLine());
                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



