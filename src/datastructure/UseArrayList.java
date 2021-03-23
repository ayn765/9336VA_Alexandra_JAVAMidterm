package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * The ArrayList class is a resizable array, which can be found in the java.util package.
           The difference between a built-in array and an ArrayList in Java, is that the size of an
           array cannot be modified (if you want to add or remove elements to/from an array, you have
           to create a new one). While elements can be added and removed from an ArrayList whenever you want.
         */

        //creating and initializing arrayList:
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //for loop to add elements to arrayList
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        //adding one integer 23 at index 4 to arrayList:
        arrayList.add(4, 23);

        //removing an element at index 2:
        arrayList.remove(2);

        //for-each loop to print all elements in the arrayList:
        for (int x : arrayList) {
            System.out.print(x + " ");
        }

        //sorting arrayList using Collections Class:
        Collections.sort(arrayList);

        //creating a table and inserting arrayList into MySqlBD:
        ConnectToSqlDB connect = new ConnectToSqlDB();
        try {
            connect.insertDataFromIntegerArrayListToSqlTable(arrayList, "array_list", "SortedNums");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


