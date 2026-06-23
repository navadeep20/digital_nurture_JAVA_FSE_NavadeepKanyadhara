package com.cognizant.library;

public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Algorithms", "CLRS"),
                new Book(102, "Computer Networks", "Forouzan"),
                new Book(103, "Data Structures", "Sahni"),
                new Book(104, "Operating Systems", "Galvin"),
                new Book(105, "Python", "Mark Lutz")

        };

        Library library = new Library();

        System.out.println("Linear Search");
        System.out.println(library.linearSearch(books, "Python"));

        System.out.println();

        System.out.println("Binary Search");
        System.out.println(library.binarySearch(books, "Python"));

    }

}