package com.packt.webstore.validator;

import com.packt.webstore.domain.Product;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategoryValidator implements ConstraintValidator<category,String>{
   List<String> allowCategory = Arrays.asList("Tablet", "Laptop");
   @Override
   public void initialize(category category) {

   }
   @Override
   public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
      if (allowCategory.contains(s)){
         return true;
      }
      return false;
   }
}
