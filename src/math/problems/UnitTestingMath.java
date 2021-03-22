package math.problems;

import org.testng.annotations.Test;

import java.time.LocalDate;

public class UnitTestingMath {

    @Test
    public void testPattern() {
        Pattern obj = new Pattern();
    }

    @Test
    public void testFibonacci() {
        Fibonacci obj = new Fibonacci();
    }

    @Test
    public void testFindLowestDifference() {
        FindLowestDifference obj = new FindLowestDifference();
    }

    @Test
    public void testFindMissingNumber() {
        FindMissingNumber obj = new FindMissingNumber();
    }

    @Test
    public void testLowestNumber() {
        LowestNumber obj = new LowestNumber();
    }

    @Test
    public void testPrimeNumber() {
        PrimeNumber obj = new PrimeNumber();
    }
}