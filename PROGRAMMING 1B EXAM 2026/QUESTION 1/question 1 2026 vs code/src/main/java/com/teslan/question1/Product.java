package com.teslan.question1;

public class Product {

    private int[] quantities = {5, 10, 15};

    public int calculateTotal() {
        int total = 0;

        for (int quantity : quantities) {
            total += quantity;
        }

        return total;
    }
}