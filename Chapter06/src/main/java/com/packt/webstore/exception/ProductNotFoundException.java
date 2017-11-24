package com.packt.webstore.exception;

/**
 * Created by chinhvd on 11/22/17.
 */
public class ProductNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String productId;

    public ProductNotFoundException(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

}
