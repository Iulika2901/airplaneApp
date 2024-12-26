package org.example.proiect2;

public class Employee {
    private String lastName;
    private String firstName;
    private double salary;

    public Employee(String lastName, String firstName, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }
}
