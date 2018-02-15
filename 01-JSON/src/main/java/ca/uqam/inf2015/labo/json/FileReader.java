package ca.uqam.inf2015.labo.json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public String StringFromFile(String PathToFile){
        String fileContent = "";
        try {
            fileContent = new String(Files.readAllBytes(Paths.get(PathToFile)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }
}
