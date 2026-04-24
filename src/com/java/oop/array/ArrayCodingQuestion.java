package com.java.oop.array;

public class ArrayCodingQuestion {

    public static int findHighestPrice(int[] productPrices){
        int highest = 0;
        for (int price : productPrices){
            if (price > highest){
                highest = price;
            }
        }
        return highest;
    }



    public static void main(String[] args) {
        int[] productPrices = {10,20,300,40,50};
        System.out.println(findHighestPrice(productPrices));

    }
}
