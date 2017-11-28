package com.packt.webstore.validator;

import com.packt.webstore.domain.Product;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.Validation;

/**
 * Created by ChinhVD on 11/28/17.
 */
@Component
public class ProductImageValidator implements Validator{
    double allowSize = 2000000;
    @Override
    public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    public void setAllowImageSize(double size){
        allowSize = size;
    }
    @Override
    public void validate(Object target, Errors errors) {
        Product product = (Product) target;
        double size = product.getProductImage().getSize();
        if (size > allowSize){
            errors.rejectValue("productImage", "com.packt.webstore.validator.Image.message");
        }
    }
}
