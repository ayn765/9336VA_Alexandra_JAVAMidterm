package math.problems;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        findFactorial(5);
        findFactorial(15);
        findFactorial(-5);

        System.out.println(findFactorialRecursion(5));
        System.out.println(findFactorialRecursion(15));
        System.out.println(findFactorialRecursion(-1));

    }
    public static long findFactorial(int n) {
        long factorial = 1;
        if (n <= 0) {
            System.out.println("INVALID NUMBER");
            return -1;
        } else {
            for (int i = 1; i <= n; i++) {

                factorial*= i;
            }
            System.out.println("Factorial number of " + n + " is " + factorial);
        }return factorial;
    }
    public static long findFactorialRecursion(int number) {

        if (number <= 0) {
            return 1;
        } else {
            return (number * findFactorialRecursion(number - 1));
        }
    }
}

