package io.pragra.learning.hrms;

public class TempEmployee implements IEmployee{
    @Override
    public void hire() {
        System.out.println("NO INTERVIEW REQUIRED");
    }

    @Override
    public void terminate() {

    }

    @Override
    public double bonus() {
        return 0;
    }

    @Override
    public void display() {
        System.out.println("I dont have any details ");
    }
}
