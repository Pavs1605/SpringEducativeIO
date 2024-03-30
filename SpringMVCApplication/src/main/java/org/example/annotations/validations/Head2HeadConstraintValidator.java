package org.example.annotations.validations;

import org.example.annotations.HeadToHead;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class Head2HeadConstraintValidator implements ConstraintValidator <HeadToHead, String> {

    @Override
    public void initialize(HeadToHead headToHead) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = s.matches("[0-9]{1,2}-[0-9]{1,2}");
        return result;
    }
}
