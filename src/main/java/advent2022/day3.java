package advent2022;

import java.util.ArrayList;

public class day3 {


    public static void main(String[] args){
        ArrayList<String> textInput = HelperClass.readFileLines("input3a.txt");

        int result = 0;
        for (String s : textInput) {
            result += calcWin(s);
        }

        System.out.println("Result : " + result);
    }
    private static int calcWin(String line){
        String[] s = line.split(" ");
        return playScore2(s[0], s[1]);
    }

    // Part 1
    static int playScore(String a, String b) {
        int result = switch (a){
                    case "A" -> b.equals("X") ? 3 : b.equals("Y") ? 6 : 0;
                    case "B" -> b.equals("Y") ? 3 : b.equals("Z") ? 6 : 0;
                    default -> b.equals("Z") ? 3 : b.equals("Y") ? 0 : 6;
            };
        int i = calcRpsValue(b);

        int resultingScore = result + i;
        System.out.println(textToScore(a) +" " + textToScore(b) + " -> " + result +", "+ i +" = " + resultingScore);
        return resultingScore;
    }

    // Part 2
    private static int playScore2(String a, String b) {
        int result = switch (b){
            case "X" -> 0;
            case "Y" -> 3;
            default -> 6;
        };
        int i = part2(a,b);

        int resultingScore = result + i;
        System.out.println(textToScore2(b) +" " + textToScore2(a) + " -> " + result +", "+ i +" = " + resultingScore);
        return resultingScore;
    }

    private static int calcRpsValue(String b) {
        return switch(b){
            case "A","X" -> 1;
            case "B","Y" -> 2;
            default -> 3;
        };
    }

    private static String textToScore(String a){
        return switch(a){
            case "A","X" -> "Stone (1)";
            case "B","Y" -> "Paper (2)";
            default -> "Scissor (3)";
        };
    }

    private static String textToScore2(String a){
        return switch(a){
            case "A" -> "Stone (1)";
            case "B" -> "Paper (2)";
            case "C" -> "Scissor (3)";
            case "X" -> "Loose (0)";
            case "Y" -> "Draw (3)";
            case "Z" -> "Win (6)";
            default -> "ERROR";
        };
    }

    private static int part2(String a, String b){
        return switch(b){
            case "X" -> a.equals("A") ? 3 :a.equals("B") ? 1 : 2;
            case "Y" -> a.equals("A") ? 1 :a.equals("B") ? 2 : 3;
            default -> a.equals("A") ? 2 :a.equals("B") ? 3 : 1;
        };
    }

}