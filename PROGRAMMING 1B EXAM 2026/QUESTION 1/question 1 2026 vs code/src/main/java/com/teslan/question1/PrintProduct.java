package com.teslan.question1;

public class PrintProduct {

    public static void main(String[] args) {

        Product product = new Product();

        int total = product.calculateTotal();

        System.out.println("PRODUCT REPORT");
        System.out.println("--------------------");
        System.out.println("Total Quantity: " + total);
    }
}