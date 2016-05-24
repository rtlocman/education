package my.study;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by red2 on 19.05.2016.
 */
public class JCopy {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Far";
        System.out.println("JCopy");
        JCopy jCopy = new JCopy();
        jCopy.copy(FileSystems.getDefault().getPath(path),null);
    }

    void copy(Path src, Path dst) throws IOException {
        for (Path ipath : Files.newDirectoryStream(src)) {
            if (Files.isDirectory(ipath)) {
                if (Files.isExecutable(ipath)) {
                    System.out.println(ipath);
//                    copy(ipath)
//                    count+=calculateFiles(ipath);
                } else {
//                System.out.println(ipath);
//                count++;
                }

            }
        }
    }
}