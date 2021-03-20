package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++){
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
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }System.out.println();

        for(String element: queue1){
            System.out.print(element + " ");
        }

    }



}
