package com.java.oop.collections.assignment;

import java.util.List;

public class ProductService {
    private List<Product> products;
    private CsvReader csvReader;

    public ProductService(CsvReader csvReader) {
        this.csvReader = csvReader;
        products = this.csvReader.getProductsFromCsv();
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product addProduct(Product product){
        products.add(product);
        return product;
    }
}
