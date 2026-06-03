package com.java.oop.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
   public static void main(String[] args) {
       HashSet<Product> productSet = new HashSet<>();

       productSet.add(new Product(111,"product 1",1000,1.5f,10,true,"company 1","category 1"));
       productSet.add(new Product(222,"product 2",2000,2.5f,20,false,"company 2","category 2"));
       productSet.add(new Product(333,"product 3",3000,3.5f,30,true,"company 3","category 3"));
       productSet.add(new Product(444,"product 4",4000,4.5f,40,false,"company 4","category 4"));
       productSet.add(new Product(555,"product 5",5000,5.0f,50,true,"company 5","category 5"));
       productSet.add(new Product(111,"product 1",1000,1.5f,10,true,"company 1","category 1"));
       productSet.add(new Product(222,"product 2",2000,2.5f,20,false,"company 2","category 2"));

       System.out.println(productSet.toString());

       Iterator<Product> iterator = productSet.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
   }
}
