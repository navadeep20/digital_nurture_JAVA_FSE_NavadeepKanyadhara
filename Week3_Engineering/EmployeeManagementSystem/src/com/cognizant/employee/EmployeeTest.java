package com.cognizant.employee;

public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee(101, "Navadeep", "Developer", 60000));

        manager.addEmployee(new Employee(102, "Rahul", "Tester", 45000));

        manager.addEmployee(new Employee(103, "Akhil", "Manager", 85000));

        System.out.println();

        System.out.println("Employee List");

        manager.displayEmployees();

        System.out.println();

        System.out.println("Searching Employee");

        System.out.println(manager.searchEmployee(102));

        System.out.println();

        manager.deleteEmployee(102);

        System.out.println();

        System.out.println("Updated Employee List");

        manager.displayEmployees();

    }

}