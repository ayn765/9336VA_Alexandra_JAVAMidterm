package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below
         Should return "10 biological"
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);


    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
//        String[] tokens = wordGiven.split(" ");
//        for (String token : tokens){
//            String word = token.toLowerCase();
//            if (map.containsKey(word)) {
//                int count = map.get(word); // get word count
//                map.put(word, count + 1); // override word count
//            } else {
//                map.put(word, 1); // initial word count to 1
//            }
//        }
//        // Implement here

        return map;
    }
}
