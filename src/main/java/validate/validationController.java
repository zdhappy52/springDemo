package validate;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;


@RestController

public class validationController {


    @Autowired
    private Validator validator;

    @PostMapping("/validate")
    public void validate( @RequestBody LoginVO phoneNumber){
        System.out.println(phoneNumber);
        LoginVO loginVO = new LoginVO();
        loginVO.setMobile("1231");
        loginVO.setPassword("");
        Set<ConstraintViolation<LoginVO>> validate = validator.validate(loginVO);
        if (validate.isEmpty()) {
            // 校验通过，才会执行业务逻辑处理

        } else {
            for (ConstraintViolation<LoginVO> userDTOConstraintViolation : validate) {
                // 校验失败，做其它逻辑
                System.out.println(userDTOConstraintViolation);
            }
        }
//        if (bind.hasErrors()) {
//            String defaultMessage = bind.getFieldError().getDefaultMessage();
//            List<ObjectError> allErrors = bind.getAllErrors();
//            for (ObjectError allError : allErrors) {
//                System.out.println(allError.getDefaultMessage());
//
//            }
//        }


    }
}

