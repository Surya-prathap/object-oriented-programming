package com.java.oop.collections;

import java.util.Objects;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    int discountPercentage;
    boolean isAvailable;
    String company;
    String category;

    public Product(int id, String name, int maxRetailPrice, float rating, int discountPercentage, boolean isAvailable, String company, String category) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.company = company;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && maxRetailPrice == product.maxRetailPrice && Float.compare(rating, product.rating) == 0 && discountPercentage == product.discountPercentage && isAvailable == product.isAvailable && Objects.equals(name, product.name) && Objects.equals(company, product.company) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, maxRetailPrice, rating, discountPercentage, isAvailable, company, category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxRetailPrice=" + maxRetailPrice +
                ", rating=" + rating +
                ", discountPercentage=" + discountPercentage +
                ", isAvailable=" + isAvailable +
                ", company='" + company + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
