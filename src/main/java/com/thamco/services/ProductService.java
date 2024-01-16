package com.thamco.services;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thamco.models.DummyProductList;
import com.thamco.models.Product;
import com.thamco.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductService() {

    }

    public List<Product> listProducts() {
        try {
            List<Product> products = this.productRepository.listProducts();
            return products;
        } catch (Exception e) {
            e.printStackTrace();
            return new DummyProductList().createDummyProductList();
        }
    }

}