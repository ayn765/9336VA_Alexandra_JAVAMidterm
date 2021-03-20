package design;

import java.util.Scanner;

import static design.HelperMethods.isLeapYear;
import static design.HelperMethods.validateString;

public class EmployeeInfo extends Departments implements Employee {

    /*
    This class should implement the Employee interface. You can do that by directly implementing it, however you must
        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
        go to FortuneEmployee class to apply all the fields and attributes.
    Important: YOU MUST USE:
        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
        - Use all kind of keywords (super, this, static, final, etc)
        - Composition
        - Implement nested class below (DateConversion)
        - Use Exception Handling
     */

    /*
     * Make sure to declare and use static, non-static & final fields
     */
    static final String COMPANY_NAME = "Freddie Mac";
    String employeeFullName;
    private int employeeID;
    private int biWeeklyGross;
    private int salary;
    TimeOff timeOff;


    /*
     You must implement the logic for below 2 methods and
        following 2 methods are prototype as well for other methods need to be design,
        as you will come up with the new ideas.
     */

    /*
     You must have/use multiple constructors
     */
    public EmployeeInfo(int employeeID) {
        this.employeeID = employeeID;
    }

    public EmployeeInfo(String employeeFullName, int employeeId) {
        this.employeeFullName = employeeFullName;
        this.employeeID = employeeId;
    }
    public EmployeeInfo(){
    }
    public EmployeeInfo(TimeOff timeOff){

    }
    public EmployeeInfo(String employeeFullName, int employeeID, TimeOff timeOff){
        this.employeeFullName = employeeFullName;
        this.employeeID = employeeID;
        this.timeOff = timeOff;
    }


    public void setBiWeeklyGross(int biWeeklyGross){
        this.biWeeklyGross = biWeeklyGross;
    }
    public int getBiWeeklyGross(){
        return biWeeklyGross;
    }
    public int getSalary(){
        return salary;
    }

    public String inputEmployeeName() {
        String firstName;
        String lastName;
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstName = sc.next();
        while (!validateString(firstName)) {
            System.out.print("Please enter valid name: ");
            firstName = scanner.next();
        }
        System.out.print("Enter your last name: ");
        lastName = scanner.next();
        while (!validateString(lastName)) {
            System.out.print("Please enter valid name: ");
            lastName = scanner.next();
        }
        System.out.println("Welcome to " + COMPANY_NAME + ", " + firstName + " " + lastName + ".");
        return employeeFullName = firstName + lastName;
    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee bonus based on salary and performance.
        It should return the total yearly bonus.
            Example: 10% of salary for best performance, 8% of salary for average performance and so on.
            You can set arbitrary number for performance, so you probably need to send 2 arguments.
     *
     */

    public int calculateEmployeeBonus(String performance, int salary) {
        int total = 0;
        switch (performance){
            case "Best":
                total = salary/100*10;
                System.out.println("Your bonus is " + total);
                break;
            case "Average":
                total = salary/100*8;
                System.out.println("Your bonus is " + total);
                break;
            case "Bellow Average":
                total = salary/100*3;
                System.out.println("Your bonus is " + total);
                break;
            default:
                System.out.println("Keep working. You're not qualified for a bonus at this time.");
        }
        return total;
    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
     *
     */
    public  int calculateEmployeePension() {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
        System.out.println(convertedJoiningDate + " "+ convertedTodaysDate);
        return total;
    }

        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
        // Calculate pension



    public void setEmployeeID(int EmployeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public int employeeId() {
        return employeeID;
    }

    @Override
    public String employeeName() {
        inputEmployeeName();
        return employeeFullName;
    }

    @Override
    public int calculateSalary(int year, int biWeeklyGross) {
        int salary;
        if(!isLeapYear(year)){
            salary = biWeeklyGross/14*365;
            this.salary = salary;
        }else{
            salary = biWeeklyGross/14*366;
            this.salary = salary;
        }
        System.out.println("The yearly salary is " + salary);
        return salary;
    }

    @Override
    public void benefitLayout() {
        System.out.println("****** Your benefits include: ****** \n\t*Student Loan Repayment\n\t*Commuter Benefits\n\t" +
                "*Flexible health care plans\n\t*Between 15 and 20 vacation days\n\t*401(k) savings plan");

    }

    @Override
    public String assignDepartment(String dept) {
        String deptName;
        switch (dept) {
            case "hr":
                deptName = hr;
                System.out.println("You are working in " + deptName + " department.");
                break;
            case "Marketing":
                deptName = marketing;
                System.out.println("You are working in " + deptName + " department.");
                break;
            case "Sales":
                deptName = sales;
                System.out.println("You are working in " + deptName + " department.");
                break;
            case "It":
                deptName = it;
                System.out.println("You are working in " + deptName + " department.");
                break;
            case "Accounting":
                deptName = accounting;
                System.out.println("You are working in " + deptName + " department.");
                break;
            default:
                deptName = null;
                System.out.println("Department is not identified.");
        }

        return deptName;
    }


    public static class DateConversion {

        public DateConversion(Months months) {
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 7;
                    break;
                case August:
                    date = 8;
                    break;
                case September:
                    date = 9;
                    break;
                case October:
                    date = 10;
                    break;
                case November:
                    date = 11;
                    break;
                case December:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}