package advent2022;

import java.util.ArrayList;
import java.util.Collections;

public class day1 {


    public static void main(String[] args){
        ArrayList<String> textInput = HelperClass.readFileLines("input1.txt");

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