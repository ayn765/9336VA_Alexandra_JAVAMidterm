package design;

import java.time.Month;

public class FortuneEmployee {

    /**
     FortuneEmployee class has a main method where you will be able to create Object from
        EmployeeInfo class to use fields and attributes
     <p>
     Demonstrate as many methods as possible to use with proper business work flow.
        Try to think like a Software Architect/Developer.
        This application should provide basic employee information services
     </p>
     <p>
     Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     </p>
     **/
    public static void main(String[] args) {


        TimeOff timeOff = new TimeOff(14, 10);

        EmployeeInfo employee = new EmployeeInfo(timeOff);
        employee.inputEmployeeName();
        employee.setEmployeeID(123456);
        employee.assignDepartment("hr");
        employee.setBiWeeklyGross(6548);
        employee.calculateSalary(2021,employee.getBiWeeklyGross());
        employee.calculateEmployeeBonus("Best", employee.getSalary());
        employee.benefitLayout();
        employee.timeOff.checkHolidays(Month.JANUARY);



    }

}
