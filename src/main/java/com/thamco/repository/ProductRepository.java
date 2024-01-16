package com.thamco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.thamco.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    String listProducts = "SELECT p.product_id, p.product_ean,\r\n" + //
            "                    p.category_id,\r\n" + //
            "                    p.brand_id,\r\n" + //
            "                    p.product_name,\r\n" + //
            "                    p.product_description,\r\n" + //
            "                    p.product_price,\r\n" + //
            "                    p.product_in_stock,\r\n" + //
            "                    p.product_expected_restock,\r\n" + //
            "                    b.brand_name,\r\n" + //
            "                    c.category_name\r\n" + //
            "                    FROM Product_tbl p\r\n" + //
            "                    JOIN Brand_tbl b ON p.brand_id = b.brand_id\r\n" + //
            "                    JOIN Category_tbl c ON p.category_id = c.category_id;";

    @Query(value = listProducts, nativeQuery = true)
    List<Product> listProducts();
}
