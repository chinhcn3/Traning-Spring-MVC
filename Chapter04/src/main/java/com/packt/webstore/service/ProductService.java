package com.packt.webstore.service;

import java.util.List;
import java.util.Map;

import com.packt.webstore.domain.Product;

/**
 * Created by chinhvd on 11/22/17.
 */
public interface ProductService {
    void updateAllStock();

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);

    Product getProductById(String productID);

    void addProduct(Product product);
}
