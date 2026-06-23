package com.cognizant.task;

public class TaskTest {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        manager.addTask(101, "Design Database", "Pending");
        manager.addTask(102, "Develop API", "In Progress");
        manager.addTask(103, "Testing", "Pending");

        System.out.println("Task List");

        manager.displayTasks();

        System.out.println();

        System.out.println("Search Task");

        manager.searchTask(102);

        System.out.println();

        manager.deleteTask(102);

        System.out.println();

        System.out.println("Updated Task List");

        manager.displayTasks();

    }

}