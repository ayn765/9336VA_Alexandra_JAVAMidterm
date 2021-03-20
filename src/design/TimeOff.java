package design;

import java.time.Month;

public class TimeOff {

    private int numOfVacationDay;
    private int numOfSickDays;

    public int getNumOfVacationDay() {
        return numOfVacationDay;
    }

    public TimeOff(int numOfSickDays, int numOfVacationDay) {
        this.numOfSickDays = numOfSickDays;
        this.numOfVacationDay = numOfVacationDay;
    }

    public void setNumOfVacationDay(int numOfVacationDay) {
        this.numOfVacationDay = numOfVacationDay;
    }

    public int getNumOfSickDays() {
        return numOfSickDays;
    }

    public void setNumOfSickDays(int numOfSickDays) {
        this.numOfSickDays = numOfSickDays;
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
