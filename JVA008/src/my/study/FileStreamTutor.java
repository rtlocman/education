package my.study;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by red2 on 17.05.2016.
 */
public class FileStreamTutor {
    public static void main(String[] args) throws IOException {
        String path = "C:\\windows";
        FileUtil fu = new FileUtil();
        FileUtil.FsCounter fsCount = fu.calculateFiles(FileSystems.getDefault().getPath(path));
        System.out.println("In the path:" + path + "\n " + fsCount);
    }
}

/*
* on my work computer in win dir was found  116872

*
 */
class FileUtil {
    public FsCounter calculateFiles(Path path) throws IOException {
        FsCounter fsCout = new FsCounter();
        for (Path ipath : Files.newDirectoryStream(path)) {
            if (Files.isDirectory(ipath)) {
                if (Files.isExecutable(ipath)) {
                    fsCout.increment(calculateFiles(ipath));
                }
                fsCout.dirCount++;
            } else {
                fsCout.fileCount++;
            }
        }
        return fsCout;
    }

    @Deprecated
    public int calculateDirs(Path path) throws IOException {
        int count = 0;
        for (Path ipath : Files.newDirectoryStream(path)) {
            if (Files.isDirectory(ipath)) {
                if (Files.isExecutable(ipath)) {
                    count += calculateFiles(ipath).dirCount;
                }
//                System.out.println(ipath);
                count++;
            }
        }
        return count;
    }

    class FsCounter {
        int dirCount;
        int fileCount;

        public void increment(FsCounter addins) {
            dirCount += addins.dirCount;
            fileCount += addins.fileCount;
        }

        @Override
        public String toString() {
            return "consist:\n folders:" + dirCount + "\n  files:" + fileCount;
        }
    }
}
