package com.java.oop.collections.assignment;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CsvReader csvReader = new CsvReader();

        ProductService productService = new ProductService(csvReader);
        System.out.println(productService.getAllProducts());

        Product newProduct = new Product();
        newProduct.setId(101);
        newProduct.setName("New Product");
        newProduct.setMaxReatailPrice(2000);
        newProduct.setDiscountPercentage(12);
        newProduct.setAvailable(true);
        newProduct.setCompany("New Company");
        newProduct.setCategory("New Category");
        newProduct.setManufacturedYear(2026);
        productService.addProduct(newProduct);

        System.out.println(productService.getAllProducts());
    }
}
