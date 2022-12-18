package advent2022;

import java.util.ArrayList;

public class day3 {


    /**
     * Each elf loads its rucksacks with supplies.
     * Each rucksack has two compartments
     * Every item in the rucksack is defined as a char case sensitive.
     * First half of the line is packed in the first rucksack, the other half is in the second rucksack
     * One ItemType per Ruckpack, thus if you find the same characters in both ruckpacks it is wrongly packed.
     * Priority: lowercase items a-z has priorities 01 - 26
     * Priority: UPPERCASE items A-Z has priorities 27 - 52
     */
    public static void main(String[] args){
        ArrayList<String> textInput = HelperClass.readFileLines("input3a.txt");

        int result = 0;
        for (String s : textInput) {
            result += calcPart1(s);
        }

        System.out.println("Result : " + result);
    }

    private static int calcPart1(String s) {

        int middleIndex = s.length() / 2;
        String first = s.substring(0, middleIndex);
        String second = s.substring(middleIndex);

        System.out.println(first +", " + second);
        return 0;
    }


}