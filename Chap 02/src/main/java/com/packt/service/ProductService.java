package com.packt.service;

import com.packt.model.Product;

import java.util.List;
import java.util.Map;

/**
 * Created by chinhvd on 11/20/17.
 */
public interface ProductService {
    void updateAllStock();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);

    Product getProductById(String productID);
}
