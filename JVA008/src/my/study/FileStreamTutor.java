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
//        System.out.println(fu.calculateFiles(FileSystems.getDefault().getPath("C:\\windows")));
        System.out.println(fu.calculateDirs(FileSystems.getDefault().getPath("C:\\windows")));
    }
}
/*
* on my work computer in win dir was found  116872

*
 */
class FileUtil{
    public int calculateFiles(Path path) throws IOException {
        int count = 0;
        for(Path ipath: Files.newDirectoryStream(path)){
            if(Files.isDirectory(ipath)){
                if(Files.isExecutable(ipath)){
                  count+=calculateFiles(ipath);
                }
            }else{
//                System.out.println(ipath);
                count++;
            }
        }
        return count;
    }
    public int calculateDirs(Path path) throws IOException {
        int count = 0;
        for(Path ipath: Files.newDirectoryStream(path)){
            if(Files.isDirectory(ipath)) {
                if(Files.isExecutable(ipath)){
                    count+=calculateFiles(ipath);
                }
//                System.out.println(ipath);
                count++;
            }
        }
        return count;
    }}
