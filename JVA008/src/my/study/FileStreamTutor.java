package my.study;

import sun.management.FileSystem;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by red2 on 17.05.2016.
 */
public class FileStreamTutor {
    public  static void main(String[] args) throws IOException {
      FileUtil fu = new FileUtil();
        System.out.println(fu.calculateFiles("C:\\apache-tomcat-8.0.30"));
    }
}

class FileUtil{
    public int calculateFiles(String path) throws IOException {
        int count = 0;
//            Files files = new Files();// (path);
        Path dir = FileSystems.getDefault().getPath(path);
        for(Path file: Files.newDirectoryStream(dir)){
            if(!Files.isDirectory(file)&& !Files.isSymbolicLink(file)) {
                System.out.println(file);
                count++;
            }
        }
        return count;
    }
    public int calculateDirs(String path) throws IOException {
        int count = 0;
//            Files files = new Files();// (path);
        Path dir = FileSystems.getDefault().getPath(path);
        for(Path file: Files.newDirectoryStream(dir)){
            if(Files.isDirectory(file)) {
                System.out.println(file);
                count++;
            }
        }
        return count;
    }}
