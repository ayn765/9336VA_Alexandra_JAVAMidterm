package design;

import org.testng.annotations.Test;

import java.time.Month;

import static design.HelperMethods.isLeapYear;

public class UnitTestingEmployeeInfo {


    @Test
    public static void testEmployeeInfo() {
        EmployeeInfo obj = new EmployeeInfo();
    }

    @Test
    public static void testEmployee() {
        FortuneEmployee obj = new FortuneEmployee();
    }

    @Test
    public static void testEmail() {
        Email obj = new Email();
    }

    @Test
    public static void testHelperMethods() {
        HelperMethods obj = new HelperMethods();
    }

    @Test
    public static void testPC() {
        PC obj = new PC();
    }

    @Test
    public static void testSmartPhone() {
        SmartPhone obj = new SmartPhone();
    }

    @Test
    public static void testTimeOff() {
        TimeOff obj = new TimeOff();
    }
}


