package com.cognizant.search;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Keyboard", "Accessories"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Mouse", "Accessories"),
                new Product(104, "Phone", "Electronics"),
                new Product(105, "Speaker", "Audio")

        };

        SearchOperations search = new SearchOperations();

        System.out.println("Linear Search");
        System.out.println(search.linearSearch(products, "Mouse"));

        System.out.println();

        System.out.println("Binary Search");
        System.out.println(search.binarySearch(products, "Mouse"));

    }

}