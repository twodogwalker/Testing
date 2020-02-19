/*
 * Copyright (c) 2020. Frank Prins
 */

package nl.frankprins.test;

import nl.frankprins.test.model.Product;

public class MyMainClass {

    public static final String HI = "Hi!";
    public static final String HI_AGAIN = "Hi again!";

    public static void main(String[] args) {
        Product product = new Product("Frank");
        System.out.println("product = " + product.getName());

    }
}
