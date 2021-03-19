package string.problems;

import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        anagram.isAnagram("Cat", "Act");
        anagram.isAnagram("Day", "Night");
    }
    public boolean isAnagram(String word1, String word2) {
        boolean flag = false;
        if (word1.length() == word2.length()) {
            char[] array1 = word1.toLowerCase().toCharArray();
            Arrays.sort(array1);
            System.out.println(Arrays.toString(array1));
            char[] array2 = word2.toLowerCase().toCharArray();
            Arrays.sort(array2);
            System.out.println(Arrays.toString(array2));
            System.out.println(Arrays.equals(array1, array2));
            if(array1.equals(array2)) {
                System.out.println("Given words are anagrams");
                return flag = true;
            } else {
                System.out.println("Given words are not anagrams");
                return flag = false;
            }
        }return flag;
    }
}

