package my.study;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by red2 on 17.05.2016.
 */
public class DataStreamTutor {
    String fileName;
    Map<String,Integer> mapCounts;
    public static  void main(String[] args) throws IOException {
        System.out.println("DataStreamTutor");
        DataStreamTutor dataStreamTutor = new DataStreamTutor("files" + File.separator + "duck_story.txt");
        dataStreamTutor.parceFile("her");

        System.out.println("DigitCount " + dataStreamTutor.getDigitCount());
        System.out.println("Punctuation " + dataStreamTutor.getPunctuationCount());

    }

    public DataStreamTutor(String fileName) {
        this.fileName = fileName;
        mapCounts = new LinkedHashMap<String,Integer>();
        mapCounts.put("word",0);
        mapCounts.put("digit",0);
        mapCounts.put("punctuation_marks",0);

    }
/*  Word search result for "her" token
    3
    27
    99
    180
    225
    ----------
    46
    81
    346
    373
*/

    int getSubStringCount(String str){
        return 0;//counts{"str"};
    }
    int getDigitCount(){
        return mapCounts.get("digit");
    }
    int getPunctuationCount(){
        return mapCounts.get("punctuation_marks");
    }
    void parceFile(String searchStr) throws IOException {
        BufferedReader  bufferedReader = new BufferedReader (new InputStreamReader( new FileInputStream (fileName)));
        String buf;
        while((buf = bufferedReader.readLine())!=null){

//            int wordWasFoundAt = 0;
//            while((wordWasFoundAt = buf.indexOf(searchStr,wordWasFoundAt))>0){
//                mapCounts.put("word",mapCounts.get("word")+1);
//                System.out.println(wordWasFoundAt);
//                wordWasFoundAt++;
//            }

            System.out.println("----------");
            for(int i = 0; i<buf.length();i++){
               char ch = buf.charAt(i);
               if (ch >= '0' && ch <='9') {
                   mapCounts.put("digit",mapCounts.get("digit")+1);
               }else if(ch == ','){
                   mapCounts.put("punctuation_marks",mapCounts.get("punctuation_marks")+1);
               }
            }

            System.out.println(buf);
        }



    }
}


