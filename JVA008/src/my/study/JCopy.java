package my.study;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by red2 on 19.05.2016.
 */
public class JCopy {
    public static void main(String[] args) {
        System.out.println("JCopy");
    }

    void copy(Path src, Path dst) throws IOException {
        for (Path ipath : Files.newDirectoryStream(src)) {
            if (Files.isDirectory(ipath)) {
                if (Files.isExecutable(ipath)) {

//                    count+=calculateFiles(ipath);
                } else {
//                System.out.println(ipath);
//                count++;
                }

            }
        }
    }
}