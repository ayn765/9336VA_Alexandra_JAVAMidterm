package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
        arrayList.add(4,23);
        arrayList.remove(2);
        for(int x: arrayList){
            System.out.print(x + " ");
        }

        Collections.sort(arrayList);


        ConnectToSqlDB connect = new ConnectToSqlDB();
        try {
            connect.insertDataFromIntegerArrayListToSqlTable(arrayList,"array_list", "SortedNums" );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    }


//insertDataFromArrayToSqlTable(x, "array_list", "Sorted Nums");
