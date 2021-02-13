package io.pragra.learning;


import io.pragra.learning.hrms.*;

public class TestRun {
    public static void main(String[] args) {
        HRMS hrms = new HRMS();

        IEmployee employee = new Employee("Hitesh", 1000, 1000);

        hrms.hire(employee);
        hrms.displayDetails(employee);
        hrms.terminate(employee);

        IEmployee employee1 = new Contractor("Hitesh", 1000, 1000);


        hrms.hire(employee1);
        hrms.displayDetails(employee1);
        hrms.terminate(employee1);

        IEmployee emp = new TempEmployee();

        hrms.hire(emp);
        hrms.displayDetails(emp);


    }
}
