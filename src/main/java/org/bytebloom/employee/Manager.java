package org.bytebloom.employee;

public class Manager extends Employee{
    public Manager(double salary){
        super(salary);
    }

    @Override
    public double calculateTotalSalary(){
        double bonus = salary * 0.25;
        return salary + bonus;
    }
}