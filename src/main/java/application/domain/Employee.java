package application.domain;

import application.domain.enums.EmployeeType;
import application.domain.enums.PersonState;

public class Employee extends Person{

    private double salary;
    private EmployeeType employeeType;

    public Employee(){
        super();
    }

    public Employee(double salary, EmployeeType employeeType) {
        this.salary = salary;
        this.employeeType = employeeType;
    }

    public Employee(int id, String name, String lastName, String email, String password, PersonState state, double salary, EmployeeType employeeType) {
        super(id, name, lastName, email, password, state);
        this.salary = salary;
        this.employeeType = employeeType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public String toString() {
        return super.toString()+ "Emplayee{" +
                "salary=" + salary +
                ", employeeType=" + employeeType +
                '}';
    }
}
