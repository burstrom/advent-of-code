package advent2022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class day1 {


    public static void main(String[] args) throws FileNotFoundException {
        Path path = Path.of("input1.txt").toAbsolutePath();
        File input = path.toFile();

        FileReader fr = new FileReader(input);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> textInput = new ArrayList<>();

        br.lines().forEach(textInput::add);

        ArrayList<Integer> elfs = first_day(textInput);

        elfs.sort(Integer::compareTo);
        Collections.reverse(elfs);

        System.out.println(sum(
                elfs.get(0),
                elfs.get(1),
                elfs.get(2)));
    }
    private static Long sum(Integer... i){
        Long result = 0l;
        for (Integer integer : i) {
            result += integer.longValue();
        }
        return result;
    }

    private static ArrayList<Integer> first_day(ArrayList<String> input) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer temp = 0;
        for (String s : input) {
            if (s.isEmpty() || s == null) {
                list.add(temp);
                temp = 0;
            } else {
                temp += Integer.parseInt(s);
            }
        }

        return list;
    }

}