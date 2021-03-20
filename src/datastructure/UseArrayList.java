package datastructure;

import java.util.ArrayList;

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
    }

}
