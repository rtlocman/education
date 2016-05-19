package my.study;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by red2 on 17.05.2016.
 */
public class DataStreamTutor {
    String fileName;
    Map<String,Integer> counts;
    public static  void main(String[] args) throws IOException {
        System.out.println("DataStreamTutor");
        DataStreamTutor dataStreamTutor = new DataStreamTutor("files" + File.separator + "duck_story.txt");
        dataStreamTutor.parceFile();
    }

    public DataStreamTutor(String fileName) {
        this.fileName = fileName;
        counts = new LinkedHashMap<String,Integer>();

    }
    int getSubStringCount(String str){
      return 0;//counts{"str"};
    }
    void parceFile() throws IOException {
        BufferedReader  bufferedReader = new BufferedReader (new InputStreamReader( new FileInputStream
                (fileName)));
        String buf;
        while((buf = bufferedReader.readLine())!=null){
//            buf.matches()
//            for(int i = 0; i<buf.length();i++){
//               char ch = buf.charAt(i);
//               if Character.
//            }

            System.out.println(buf);
        }



    }
}


