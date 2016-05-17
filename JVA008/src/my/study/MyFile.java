package my.study;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * Created by red2 on 17.05.2016.
 */
public class MyFile {
    public static void main(String[] arg) throws IOException {
        System.out.println("Filr part");
//        FileOutputStream file = FileOutputStream("the_test.txt");
//        file.write();

        File file = new File("files/the_test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String st = "Hello Мир!!!";
        fileOutputStream.write(st.getBytes());
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        int i;
        while(( i = fileInputStream.read()) != -1){
            System.out.printf("%c  %x\n",i,i);
        }
    }

}
