package advent2022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;

public class HelperClass {
    public static ArrayList<String> readFileLines(String filename){
        Path path = Path.of("data",filename).toAbsolutePath();
        File input = path.toFile();

        FileReader fr = null;
        try {
            fr = new FileReader(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found : " + e.getCause());
        }
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> textInput = new ArrayList<>();

        br.lines().forEach(textInput::add);
        return textInput;
    }
}
