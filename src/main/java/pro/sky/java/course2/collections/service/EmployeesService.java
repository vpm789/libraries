package pro.sky.java.course2.collections.service;

import pro.sky.java.course2.collections.Employees;

import java.util.Collection;

public interface EmployeesService {

    void addEmployee(String firstName, String lastName, int department, double salary);

    void deleteEmployee(String firstName, String lastName);

    Employees findEmployee(String firstName, String lastName);

    Collection<Employees> printEmployee();
}
