package org.example.annotations;

import org.example.annotations.validations.Head2HeadConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy= Head2HeadConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface HeadToHead {

    public String message() default "Value must have digits in ##-## format.";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
