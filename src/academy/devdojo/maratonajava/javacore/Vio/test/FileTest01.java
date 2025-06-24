package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Created" + isCreate);
            System.out.println("Path " + file.getPath());
            System.out.println("Path Absolute" + file.getAbsolutePath());
            System.out.println("isDirectory" + file.isDirectory());
            System.out.println("isFile" + file.isFile());
            System.out.println("isHidden" + file.isHidden());
            System.out.println("Last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            boolean isExists = file.exists();
            if (isExists){
                System.out.println("Deleted " + file.delete());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
