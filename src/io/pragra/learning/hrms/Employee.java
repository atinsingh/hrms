package io.pragra.learning.hrms;

public class Employee extends BaseEmployee implements IEmployee{
    private static String type = "EMPLOYEE";

    public Employee(String name, double weeklySalary, double bonus) {
        super(name, type, weeklySalary, bonus);
    }

    @Override
    public void hire() {
        System.out.println("Doing 1st round ...");
        System.out.println("Doing 2nd round ...");
        System.out.println("Doing 3rd round ...");
        System.out.println("HIRED");
    }

    @Override
    public void terminate() {
        System.out.println("Awarding 2 week severance " + 2*getWeeklySalary());
        System.out.println("Terminated");
    }

    @Override
    public double bonus() {
        return super.getBonus();
    }

    @Override
    public void display() {
        System.out.printf("%s  Name       : %s \n" , getType(), getName() );
        System.out.printf("%s Salary/wk   : %f\n" , getType(), getWeeklySalary() );
        System.out.printf("%s Bonus       : %f\n", getType(), getBonus() );
        System.out.printf("%s Type        : %s\n", getType(), getType() );
    }
}
