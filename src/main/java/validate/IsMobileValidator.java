package validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

    public void initialize(IsMobile constraintAnnotation) {

    }

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
       return ValidatorUtils.isMobile(s);
    }
}
