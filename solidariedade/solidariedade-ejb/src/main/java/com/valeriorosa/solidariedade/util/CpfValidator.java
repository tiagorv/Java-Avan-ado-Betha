package com.valeriorosa.solidariedade.util;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CpfValidator implements ConstraintValidator<Cpf, String>{
    
    private final Pattern pattern = Pattern.compile("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");

    @Override
    public void initialize(Cpf constra) {
    }

    @Override
    public boolean isValid(String t, ConstraintValidatorContext cvc) {
        return pattern.matcher(t).matches();
    }
}
