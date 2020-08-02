package com.dolszewski.blog.test;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ReasonableTenureValidator implements ConstraintValidator<ReasonableTenure, Integer> {

    public ReasonableTenureValidator() {
    }

    public void initialize(ReasonableTenure constraint) {
    }

    public boolean isValid(Integer tenure, ConstraintValidatorContext context) {
        return tenure < 50 && tenure > 0;
    }

}
