package com.cognizant.inventory;

import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Product Added.");
    }

    // Update Product
    public void updateProduct(int productId, int quantity, double price) {

        Product product = products.get(productId);

        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product Updated.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {

        if (products.remove(productId) != null) {
            System.out.println("Product Deleted.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Display Products
    public void displayProducts() {

        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

}