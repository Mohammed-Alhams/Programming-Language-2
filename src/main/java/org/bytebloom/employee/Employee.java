package org.bytebloom.employee;

public class Employee {
    protected double salary;
    public Employee(double salary){
        this.salary = salary;
    }

    public double calculateTotalSalary(){
        return salary;
    }

    public void displayInfo(){
        System.out.println("Employee salary: " + salary);
    }
}