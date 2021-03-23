package algorithm;

import java.util.List;
import java.util.Random;

import databases.ConnectToSqlDB;

public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting algorithm.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        int[] num = new int[1000];
        storeRandomNumbers(num);

//        // Selection Sort
        System.out.println("***** Selection Sort *****");
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort took: "
                + selectionSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        System.out.println("Read Selection sort numbers from DataBase :");
        printValue(numbers);
        int n = num.length;
        randomize(num, n);
//
//        // Insertion Sort
//        System.out.println("***** Insertion Sort *****");
//        algo.insertionSort(num);
//        long insertionSortExecutionTime = algo.executionTime;
//        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
//                + insertionSortExecutionTime + " milliseconds");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
//        List<String> numbers1 = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
//        System.out.println("Read Insertion sort numbers from DataBase :");
//        printValue(numbers1);
//
//        //Heap Sort
//        System.out.println("\n***** Heap Sort *****");
//        algo.heapSort(num);
//        long heapSortExecutionTime = algo.executionTime;
//        System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort took: "
//                + insertionSortExecutionTime + " milliseconds");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
//        List<String> numbers4 = connectToSqlDB.readDataBase("heap_sort", "SortingNumbers");
//        System.out.println("Read Heap sort numbers from DataBase :");
//        printValue(numbers4);
//        randomize(num, n);
//
//        //Merge Sort
//        System.out.println("\n***** Merge Sort *****");
//        algo.mergeSort(num);
//        long mergeSortExecutionTime = algo.executionTime;
//        System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort took: "
//                + insertionSortExecutionTime + " milliseconds");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
//        List<String> numbers5 = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
//        System.out.println("Read Merge sort numbers from DataBase :");
//        printValue(numbers5);
//        randomize(num, n);
//
////        //Quick Sort
//        System.out.println("\n***** Quick Sort *****");
//
//        algo.quickSort(num, 0, num.length - 1);
//        long QuickSortExecutionTime = algo.executionTime;
//        System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + QuickSortExecutionTime + " milli sec");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "Quick_sort", "SortingNumbers");
//        List<String> numbers6 = connectToSqlDB.readDataBase("Quick_sort", "SortingNumbers");
//        System.out.println("Read Quick sort numbers from DataBase :");
//
//        printValue(numbers6);
//        System.out.println();
//
//        randomize(num, n);

        //Shell Sort
        System.out.println("\n***** Shell Sort *****");
        algo.shellSort(num);
        long shellSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort took: "
                + shellSortExecutionTime + " milliseconds");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
        List<String> numbers7 = connectToSqlDB.readDataBase("shell_sort", "SortingNumbers");
        printValue(numbers7);
        randomize(num, n);



        /*
         By following the same convention we used for Selection Sort, continue to do the same for all remaining sorting
            algorithms
         */


        /*
        Can you come to conclusion about which sorting algorithm is most efficient, given the size of the data set?
         */

    }




    /*
    HELPER METHODS
     */

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int[] arr, int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.print(st + " ");
        }
    }
}
