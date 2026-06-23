package com.cognizant.inventory;

public class InventoryTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 55000));

        inventory.addProduct(new Product(102, "Mouse", 25, 700));

        inventory.addProduct(new Product(103, "Keyboard", 15, 1200));

        System.out.println();

        System.out.println("Inventory");

        inventory.displayProducts();

        System.out.println();

        inventory.updateProduct(102, 30, 750);

        System.out.println();

        inventory.deleteProduct(103);

        System.out.println();

        System.out.println("Updated Inventory");

        inventory.displayProducts();

    }

}