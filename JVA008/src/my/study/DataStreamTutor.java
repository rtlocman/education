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
    public static  void main(String[] args) {
        System.out.println("DataStreamTutor");
        DataStreamTutor dataStreamTutor = new DataStreamTutor("");
    }

    public DataStreamTutor(String fileName) {
        this.fileName = fileName;
        counts = new LinkedHashMap<String,Integer>();

    }
    int getSubStringCount(String str){
      return 0;//counts{"str"};
    }
    void parceFile() throws FileNotFoundException {
        InputStreamReader inputStreamReader = new InputStreamReader( new BufferedInputStream (new FileInputStream
                ("files" + File.separator + "duck_story.txt")));\
//        inputStreamReader.
    }
}


