package io.pragra.learning.hrms;

public class BaseEmployee {
    private String name;
    private String type;
    private double weeklySalary;
    private double bonus;

    public BaseEmployee(String name, String type, double weeklySalary, double bonus) {
        this.name = name;
        this.type = type;
        this.weeklySalary = weeklySalary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double getBonus() {
        return bonus;
    }
}
