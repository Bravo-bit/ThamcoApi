package com.thamco.models;

import java.util.ArrayList;
import java.util.List;

public class DummyProductList {

    public List<Product> createDummyProductList() {
        List<Product> productList = new ArrayList<>();

        // Product 1
        Product product1 = new Product();
        product1.setProductId((long) 2);
        product1.setProductEan("5 102310 100101");

        Brand brand1 = new Brand();
        brand1.setBrandId((long) 3);
        brand1.setBrandName("Soggy Sponge");
        brand1.setBrandAvailableProductCount(6);
        product1.setBrand(brand1);

        Category category1 = new Category();
        category1.setCategoryId((long) 2);
        category1.setCategoryName("Covers");
        category1.setCategoryDescription(
                "UnderCutters Stores pride ourselves on our poor range of covers for your mobile device at premium prices. If you're lucky your phone or tablet will be protected from any dents, scratches and scuffs.");
        category1.setCategoryAvailableProductCount(4);
        product1.setCategory(category1);

        product1.setProductName("Wrap It and Hope Cover");
        product1.setProductDescription("Poor quality fake faux leather cover loose enough to fit any mobile device.");
        product1.setProductPrice(5.01);
        product1.setProductInStock(0);
        product1.setProductExpectedRestock(null);

        productList.add(product1);

        // Product 2
        Product product2 = new Product();
        product2.setProductId((long) 3);
        product2.setProductEan("5 102310 200102");

        Brand brand2 = new Brand();
        brand2.setBrandId((long) 2);
        brand2.setBrandName("Damp Squib");
        brand2.setBrandAvailableProductCount(4);
        product2.setBrand(brand2);

        Category category2 = new Category();
        category2.setCategoryId((long) 2);
        category2.setCategoryName("Covers");
        category2.setCategoryDescription(
                "UnderCutters Stores pride ourselves on our poor range of covers for your mobile device at premium prices. If you're lucky your phone or tablet will be protected from any dents, scratches and scuffs.");
        category2.setCategoryAvailableProductCount(4);
        product2.setCategory(category2);

        product2.setProductName("Chocolate Cover");
        product2.setProductDescription(
                "Purchase your favorite chocolate and use the provided heating element to melt it into the perfect cover for your mobile device.");
        product2.setProductPrice(11.72);
        product2.setProductInStock(0);
        product2.setProductExpectedRestock(null);

        productList.add(product2);

        return productList;
    }
}