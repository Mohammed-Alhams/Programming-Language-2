package org.bytebloom.employee;

public class Developer extends Employee{
    public Developer(double salary){
        super(salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("الدفلوبر المطحون " + this.salary);
    }
}
