package it.develhope;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        File file = new File("./src/file.txt");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(f);

        try {
            if(file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }

            FileWriter fw = new FileWriter(file);
            fw.write(formatDateTime);
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
