package datastructure;

import databases.ConnectToSqlDB;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * The queue interface is provided in java.util package and it implements the Collection interface.
         * The queue implements FIFO i.e. First In First Out. This means that the elements entered first are
         * the ones that are deleted first.
         */

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        System.out.println("Elements of the queue: " + queue);

        int removedElem = queue.remove();
        System.out.println(removedElem);

        int head = queue.peek();
        System.out.println(head);

        int poll = queue.poll();
        System.out.println(poll);

        queue.add(45);
        System.out.println(queue);

        Queue<String> queue1 = new LinkedList<>();
        queue1.add("Midterm");
        queue1.add("is");
        queue1.add("a lot of");
        queue1.add("work");

        Iterator iterator = queue1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        for (String element : queue1) {
            System.out.print(element + " ");
        }
        ConnectToSqlDB connect = new ConnectToSqlDB();



    }

}
