package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {

        /*
         Write a java program to find the duplicate words and their number of occurrences in the string.
            Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        duplicateWord(st);
    }

    public static void duplicateWord(String st) {

        int count;
        int wordLength = 0;
        int count2 = 0;
        char[] wordsChars;
        String words[] = st.toLowerCase().split(" ");
        System.out.println("Duplicate words in a given st : ");
        //comparing every word to the rest of the words in array to find duplicates
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            //printing duplicate words
            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
        //calculating count of all letters and dividing it by number of the words
        for (String x : words) {
            wordsChars = x.toCharArray();
            wordLength += wordsChars.length;
            count2++;
        }
        System.out.println("The average length of the words is " + wordLength / count2);
    }
}

