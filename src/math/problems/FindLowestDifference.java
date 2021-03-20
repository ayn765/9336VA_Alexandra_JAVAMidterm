package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};


       //design, sorting algorithm, json xml
        System.out.println(lowestDiff( array1, array2 ));
    }

    public static int lowestDiff(int[] array1, int[] array2) {

        int Min = Math.abs( array1[0]-array2[0] ); // abs() returns absolute value of int value
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                int difference = Math.abs( array1[i] - array2[j] );
                if (difference < Min)
                    Min = difference;
            }
        }

        return Min;

    }


}



