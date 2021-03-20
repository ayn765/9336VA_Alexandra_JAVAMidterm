package design;

import java.time.Month;

import static design.HelperMethods.isLeapYear;

public class UnitTestingEmployeeInfo {
    public int salary;
    public int biWeekly;

    public static void main(String[] args) {
        // Use this class to write unit tests for all user-defined methods that you have implemented in this package.

        UnitTestingEmployeeInfo obj = new UnitTestingEmployeeInfo();
        obj.biWeekly = 1995;
       obj.checkHolidays(Month.JANUARY);

    }
    public String checkHolidays(Month month) {
        switch (month) {
            case JANUARY:
                System.out.println("The holidays in January are : New Year Day and Martin Luther King's Day.");
                break;
            case FEBRUARY:
                System.out.println("The holiday in February is : Presidents Day.");
                break;
            case MAY:
                System.out.println("The holiday in May is Memorial Day.");
                break;
            case JULY:
                System.out.println("The holiday in July is Independence Day.");
                break;
            case SEPTEMBER:
                System.out.println("The holiday in September is Labor Day.");
                break;
            case OCTOBER:
                System.out.println("The holiday in October is Columbus Day.");
                break;
            case NOVEMBER:
                System.out.println("The holidays in November are Thanksgiving and Veteran's Day. ");
                break;
            case DECEMBER:
                System.out.println("The holiday in December is Christmas Day.");
        }

        return null;
    }
}
