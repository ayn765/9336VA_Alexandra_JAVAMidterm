package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */

        isPalindrome("Mom");
    }

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        String str1 = "";
        for(int i = 0; i < str.length(); i ++){
            ch[i] = str.charAt(str.length() - i - 1);
        }
        for(int i = 0; i < str.length(); i++){
            str1 += ch[i];
        }
        if(str.equals(str1)){
            System.out.println("The word " + str + " is a palindrome.");
            return true;
        }
        System.out.println("The word " + str + " is not a palindrome.");
        return false;
    }
}


