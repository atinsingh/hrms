package io.pragra.learning.hrms;

public class HRMS {

    public void hire(IEmployee emp) {
        emp.hire();
    }

    public  void  terminate(IEmployee emp){
        emp.terminate();
    }

    public void bonus(IEmployee emp) {
        System.out.println(emp.bonus());
    }

    public void displayDetails(IEmployee emp) {
        emp.display();
    }
}
