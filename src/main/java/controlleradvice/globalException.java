package controlleradvice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice

public class globalException {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String test(HttpServletRequest request, HttpServletResponse response, Exception e){

        System.out.println(e.getMessage());
        return ""+ e.getMessage();
    }


}
