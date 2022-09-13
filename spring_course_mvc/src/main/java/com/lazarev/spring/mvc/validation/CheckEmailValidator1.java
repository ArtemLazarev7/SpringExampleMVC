/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lazarev.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author ArtemLazarev
 */
public class CheckEmailValidator1 implements ConstraintValidator<CheckEmail,String> {
    private String endOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail=checkEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext cvc) {
      return enteredValue.endsWith(endOfEmail);
    
}
}
