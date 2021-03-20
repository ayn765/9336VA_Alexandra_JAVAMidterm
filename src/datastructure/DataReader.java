package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

    public static void main(String[] args) {
        /*
         * Create an API to read the below textFile and print it to the console.
         *      HINT: Use BufferedReader class
         * Use try-catch block to handle Exceptions
         *
         * Store and retrieve the file to/from a database table.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as LIFO order from Stack.
         *
         * Demonstrate how to use Stack using push, peek, search & pop methods.
         * Use For-Each & While-loop with Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";


        FileReader file_reader = null;
        BufferedReader buffer_reader = null;

        try {
            file_reader = new FileReader(textFile);    //initializing File Reader

            buffer_reader = new BufferedReader(file_reader);  // initializing Buffer Reader
        } catch (FileNotFoundException e) {   //catching file not found exception

            e.printStackTrace();
        }
        String st = "";
        String store = "";
        try {
            while ((st = buffer_reader.readLine()) != null) {   //if there is text present store it in var store
                store += st;
                System.out.println(st);
            }
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            if (file_reader != null) {
                file_reader = null;
            }
            if (buffer_reader != null) {
                buffer_reader = null;
            }

        }
        String[] array = store.split(" ");  //Split text into words and store into String array
        List<String> list = new LinkedList<String>();  //initialized ListArray to store the text
        Stack<String> storeStack = new Stack<String>(); //initialized Stack to store the text

        for (String element : array) {
            list.add(element); // adding each element of String array into list
            storeStack.push(element); //push is used here to add elements to stack
        }
        System.out.println("\nLinkedList FIFO:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println("\n\nStack FILO:");

        while (!storeStack.isEmpty()) {
            System.out.print(storeStack.pop() + " ");
// POP remove the item from the stack as - last in first out
        }
        System.out.println();

        System.out.println(storeStack.push("companies"));
        System.out.println(storeStack.peek()); //checks the first element
        System.out.println(storeStack.search("companies")); //finds the distance from the top. count starts form 1
        System.out.println(storeStack.pop());
        System.out.println(storeStack.empty()); //check is empty


    }

}
